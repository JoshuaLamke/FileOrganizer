package file_organizer_gui;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

import directory_watching.DirectoryRegisterer; 

public class ConfigFileReader {
	Scanner inputStream;
	public void readConfig() {
	String line = "";
	String[] lineSplit;
	String watchDirectory;
	boolean recursive;
	String moveDirectory;
	String fileType;
	try {
		inputStream = new Scanner(new FileReader("config.txt"));
		while(inputStream.hasNextLine()) {
			line=inputStream.nextLine();
			if(line.charAt(0)=='#' || line == null || line.equals("open_space")) {
				continue;
			}
			lineSplit=line.split(",");
			if(lineSplit[0].equals("WATCH") && lineSplit.length==3) {
				watchDirectory = lineSplit[1];
				Path watchPath = Paths.get(watchDirectory);
				if(lineSplit[2].equals("Recursive")) {
					recursive=true;
					DirectoryValidator.validate(watchPath);//See if the path is valid
					DirectoryRegisterer.registerDirectory(watchPath, recursive);//register path recursively
				}
				else {
					recursive=false;
					DirectoryValidator.validate(watchPath);//See if path is valid
					DirectoryRegisterer.registerDirectory(watchPath, recursive);//register path non-recursively
				}
			}	
			else if(lineSplit[0].equals("MOVE") && lineSplit.length==3) {
				moveDirectory = lineSplit[1];
				fileType = lineSplit[2];
				Path movePath = Paths.get(moveDirectory);
				//set up the file type to be moved to certain directory
				
			}
		}
	}
	catch(Exception e) {
		
	}
	}
}
