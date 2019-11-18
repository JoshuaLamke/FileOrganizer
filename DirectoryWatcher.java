import java.nio.file.*;
import static java.nio.file.StandardWatchEventKinds.*;
import static java.nio.file.LinkOption.*;
import java.nio.file.attribute.*;
import java.io.*;
import java.util.*;

public class DirectoryWatcher{
    protected final WatchService watcher;
    protected final Map<WatchKey,Path> keys;
    protected final boolean recursive;
    protected boolean trace = false;
    
    
   @SuppressWarnings("unchecked") //This will surpress the annoying compilation warning whenever we cast something.
    static <T> WatchEvent<T> cast(WatchEvent<?> event) {
        return (WatchEvent<T>)event;
    }

    public DirectoryWatcher(Path dir, boolean recursive) throws IOException {//This is the constrcutor. This creates the watcher. The user specifies if he/she wants to walk the file tree and register everything to the watcher or not.
        this.watcher = FileSystems.getDefault().newWatchService();
        this.keys = new HashMap<WatchKey,Path>();//IDK why I'm using a hashmap and how that's different from a regular map
        this.recursive = recursive;
 
        if (recursive) {
            System.out.format("Scanning %s ...\n", dir);
            registerAll(dir);
            System.out.println("Done.");
        } else {
            register(dir);
        }
        this.trace = true; // enable trace after initial registration, so we know there's already a watcher initiated and active.
    }
    
    private void register(Path dir) throws IOException {
        WatchKey key = dir.register(watcher, ENTRY_CREATE);//Only care if a file is created in the directory, not if it's moved or deleted.
        if (trace) {//If there's already a key in the keys map, then it will retrieve it. If not, it will simply create a new one with the respective path the user wants it to watch and put it into the "keys" map.
          Path prev = keys.get(key);
          if (prev == null) { //If the key points to no path (null), then it will register the path/directory with the watcher
            System.out.format("System will now register: %s \n", dir);
          } 
          else {//If it does point to a path that it's watching...
            if (!dir.equals(prev)) { //then it will check to see if it's the same path that the user is trying to register, 
              System.out.format("System has now updated: %s -> %s\n", prev, dir);//If it isn't, then it will tell the user that the old path has been discarded and the new path is being watched by the watcher.
            }
          }
        }
        keys.put(key, dir);//It will then put the key to the watcher along with the path it's watching into the "keys" map.
    }

    private void registerAll(final Path start) throws IOException {
        // register directory and all of its sub-directories. This is the method we call when the user specifies that they want the watcher to walk the file tree and register the directory and ALL of its subdirectories.
        Files.walkFileTree(start, new SimpleFileVisitor<Path>() {
            @Override
            public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) throws IOException {
              register(dir); //Calls the original register(dir) method above
              return FileVisitResult.CONTINUE;
            }
        }
        );
    }
    
    void processEvents() {
      for (;;) { // wait for key to be signalled, otherwise it'll just run forever. Kinda like a while loop.
        WatchKey key;
        try {
          key = watcher.take(); //Retrieves and removes next watch key, waiting if none are yet present.
        }
        catch (InterruptedException x) {//Means it was interrupted so it'll exit the method and return.
          return;
        }
        Path dir = keys.get(key); //Gets the directory/path that the key was watching.
        if (dir == null) {//Checks to see if the key was even watching a path. If not...
          System.err.println("WatchKey not recognized!!");//It will show this message and move onto the next iteration (i.e. keep looking for the next key.
          continue;
        }
        for (WatchEvent<?> event: key.pollEvents()) {//key.pollEvents() returns a list of all the pending events in a watchkey. So if it's watching a path , then it will iterate through all the events in the watchkey. 
          WatchEvent.Kind kind = event.kind(); // TBD - provide example of how OVERFLOW event is handled
          if (kind == OVERFLOW) {//Kind is the type of event (CREATE, DELETE, or MODIFY)
          continue;
          }
          // Context for directory entry event is the file name of entry
          WatchEvent<Path> ev = cast(event);//It'll take the event from the watchkey in every iteration, and 
          Path name = ev.context();//Will return the path between the directory that the watcher is watching and the specified event.
          Path child = dir.resolve(name);//Turns the name into a proper path.
 
          // print out event
          System.out.format("%s: %s\n", event.kind().name(), child);
          // if directory is created, and watching recursively, then
          // register it and its sub-directories
          if (recursive && (kind == ENTRY_CREATE)) {//If the directory has subdirectories (is recursive) and the event is CREATE...
            try {
              if (Files.isDirectory(child, NOFOLLOW_LINKS)) { //... and if it's a valid directory...
                registerAll(child);//It will register it and all of it's subdirectories.
              }
            } 
            catch (IOException x) {
              // ignore 
            }
          }
        }
        // reset key and remove from set if directory no longer accessible
        boolean valid = key.reset(); //resets the key
        if (!valid) {//If it wasn't able to reset, then it'll simply remove the key.
          keys.remove(key);
          // all directories are inaccessible
          if (keys.isEmpty()) {
            break;
          }
        }
      }
    }
    
    public static void main(String[] args) throws IOException{
      
    }
}
