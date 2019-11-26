package file_organizer_gui;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import directory_watching.DirectoryWatcher;
/**
 * @author Joshua Lamke
 * validates a path 
 */
public class DirectoryValidator {
	/**
	 * Validates the directory and if it is valid 
	 * @param p the path to be validated
	 * @param recursive whether to search recursively or not
	 * @throws DirectoryNotFoundException if the path was not found in the file system
	 */
	public static void validate(Path p) throws DirectoryNotFoundException{
		if(Files.notExists(p)) {
		throw new DirectoryNotFoundException(p);
		}
	}	
} 

