import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.io.*;
import javax.swing.JOptionPane;
import static java.nio.file.StandardCopyOption.*;
public class FileMover{
  public Path newDirectory;
  public String fileType;
  public Path filePath;
  public Path newPath;
 
  public FileMover(Path filePath, String fileType){
    this.filePath = filePath;
    this.fileType = fileType;
    this.newDirectory = new NewDirectoryChooser(fileType).choose();//Paths.get("C:\\Users\\gerar\\TestingWatcher"); <-- this was for testing, ignore this comment.
    this.newPath = Paths.get(this.newDirectory.toString() + fileNameFinder(this.filePath));
    try{
      Path temp = Files.move(this.filePath, this.newPath, REPLACE_EXISTING);
    }
    catch (IOException e){
      JOptionPane.showMessageDialog(null, "Could not move file.", "Error", JOptionPane.INFORMATION_MESSAGE);
    }
  }
  public static String fileNameFinder(Path filePath){//Will find the name of a file (incluf=ding the file extension), but return it as a String.
    String pathString = filePath.toString();
    int wantedIndex = pathString.lastIndexOf("\\");
    String realAnswer = pathString.substring(wantedIndex);
    return realAnswer;
  }
  public static void main(String[] args){
    Path path = Paths.get("C:\\Users\\gerar\\Downloads\\209_gabaunza_P1.zip");
    
    FileMover mover1 = new FileMover(path, "zip");
  }
}
