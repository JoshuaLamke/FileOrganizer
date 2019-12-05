package file_organizer_gui;

import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

import javax.swing.JOptionPane;

import directory_watching.DirectoryWatcher; 

public class ConfigFileReader {
	Scanner inputStream;
	DirectoryWatcher watcher;
	public void readConfig() {
	String line = "";
	String[] lineSplit;
	String watchDirectory;
	FileMoverSetUp setUp = new FileMoverSetUp();
	String moveDirectory;
	String fileType;
	try {
		watcher = new DirectoryWatcher();
		inputStream = new Scanner(new FileReader("config.txt"));
		while(inputStream.hasNextLine()) {
			line=inputStream.nextLine();
			if(line.charAt(0)=='#' || line == null || line.equals("open_space")) {
				continue;
			}
			else {
			lineSplit=line.split(",");
			if(lineSplit[0].equals("WATCH") && lineSplit.length==3) {
				watchDirectory = lineSplit[1];
				Path watchPath = Paths.get(watchDirectory);
				if(lineSplit[2].equals("Recursive")) {
					DirectoryValidator.validate(watchPath);//See if the path is valid
					watcher.registerAll(watchPath);//register path recursively
					System.out.println( watchPath + " registered recursively");
				}
				else {
					DirectoryValidator.validate(watchPath);//See if path is valid
					watcher.register(watchPath);//register path non-recursively
					System.out.println(watchPath + " registered non-recursively");
				}
			}	
			else if(lineSplit[0].equals("MOVE") && lineSplit.length==3) {
				moveDirectory = lineSplit[1];
				fileType = lineSplit[2];
				Path movePath = Paths.get(moveDirectory);
				setUp.registerFileType(movePath, fileType);
				System.out.println(fileType + " move path registered");
			}
		}
	}
	}
	catch(DirectoryNotFoundException e) {
		e.getExceptionPopUp();
	}
	catch(IOException e) {
		JOptionPane.showMessageDialog(null, "Something has gone wrong with config file registration, please restart the program.", "Error", JOptionPane.INFORMATION_MESSAGE);
	}
	}
	public DirectoryWatcher getWatcher() {
		return watcher;
	}
}
