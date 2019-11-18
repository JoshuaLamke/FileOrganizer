package file_organizer_gui;

import java.io.FileReader;
import java.util.Scanner;

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
			if(inputStream.next().charAt(0)=='#' || inputStream.next()==null) {
				inputStream.nextLine();
				continue;
			}
			line=inputStream.nextLine();
			lineSplit=line.split(",");
			if(lineSplit[0].equals("WATCH") && lineSplit.length==3) {
				watchDirectory = lineSplit[1];
				if(lineSplit[2].equals("Recursive")) {
					recursive=true;
					
				}
				else {
					recursive=false;
				}
			}	
			else if(lineSplit[0].equals("MOVE") && lineSplit.length==3) {
				moveDirectory = lineSplit[1];
				fileType = lineSplit[2];
				
			}
			else {
				inputStream.nextLine();
			}
		
		}
	}
	catch(Exception e){
		
	}
	}
}
