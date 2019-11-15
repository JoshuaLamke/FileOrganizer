package file_organizer_gui;
import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
public class DirectoryValidator {
	private static boolean valid;
	public static void validate(Path p,boolean recursive) throws DirectoryNotFoundException{
		if(Files.notExists(p))
		throw new DirectoryNotFoundException(p);
	    else {
	    	if(Files.isDirectory(p) && recursive) {
	    		//Register the directory recursively
	    	}
	    	else if(Files.isDirectory(p) && !recursive){
	    		//Register the directory non-recursively
	    	}
	    	else {
	    		//Register the file non recursively
	    	}
	    }
	}	
}

