package file_organizer_gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileWriter;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ConfigFileStreamer {
	private FileWriter writer;
	private static int lineToBeEditedWatch;
	private Scanner configScanner;
	private int lineNumber;
	private String output;
	private static List<String> configContents;
	/**
	 * @author joshua lamke
	 * @param p the path that will be writen to the config file
	 * @param fileType the type of file that will be writen to the config file
	 */
	public ConfigFileStreamer(Path p, String fileType) {//this constructor is for the move directory part of config file
		output = "MOVE," + p.toString() + "," + fileType;
		switch(fileType) {
		case("Word"):
			lineNumber=24;
			break;
		case("PDF"):
			lineNumber = 25;
			break;
		case("Text"):
			lineNumber = 26;
			break;
		case("Powerpoint"):
			lineNumber = 27;
			break;
		case("Image"):
			lineNumber = 28;
			break;
		case("Excel"):
			lineNumber = 29;
			break;
		case("Other"):
			lineNumber = 30;
			break;
		}
		listLoader();
		configContents.set(lineNumber-1,output);
		try {
		int counter=0;//counter to not add a newline to config file when recopying the contents from the list
		writer = new FileWriter("config.txt");
		for(String line:configContents) {
			if(counter>=29) {
				writer.write(line);
				break;
			}
			writer.write(line + "\n");
			counter++;
		}
		writer.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		configContents.clear();
	}
	public ConfigFileStreamer(Path p, boolean recursive) {
		if(lineToBeEditedWatch==20) {
			lineToBeEditedWatch=10;
			lineNumber = lineToBeEditedWatch;
			lineToBeEditedWatch++;
		}
		else {
			lineNumber=lineToBeEditedWatch;//line of config file to be edited
			lineToBeEditedWatch++;
		}
		if(recursive)
			output = "WATCH," + p.toString() + ",RECURSIVE";//The string that will be written to config file
		else
			output = "WATCH," + p.toString() + ",NOT_RECURSIVE";//The string that will be written to config file
		listLoader();
		configContents.set(lineNumber-1, output);
		try {
			int counter=0;//counter that counts lines so a newline isn't added to config file
			writer = new FileWriter("config.txt");
			for(String line:configContents) {
				if(counter>=28) {
					writer.write(line);
					break;
				}
				writer.write(line + "\n");
			}
			writer.close();
			}
			catch(Exception e) {
				e.printStackTrace();
			}
			configContents.clear();
	}
	private void listLoader() {
		configContents=new ArrayList<String>();
		try {
			configScanner=new Scanner(new File("config.txt"));
			while(configScanner.hasNext()) {
				configContents.add(configScanner.nextLine());
			}
			}
			catch(Exception e) {
				e.printStackTrace();
			}
			finally {
				configScanner.close();
			}
	}
	static {//instantiate the lines to be edited and the list that reads in the config file
		lineToBeEditedWatch = 10;
	}

}
