package file_organizer_gui;

import java.nio.file.Path;

public class FileMoverSetUp {
	public static Path wordDocDirectory;
	public static Path pdfDirectory;
	public static Path textFileDirectory;
	public static Path powerpointDirectory;
	public static Path imageDirectory;
	public static Path excelDirectory;
	public static Path otherDirectory;
	public void registerFileType(Path moveDirectory,String fileType) {
		switch(fileType) {
		case("Word"):
			wordDocDirectory = moveDirectory;
			break;
		case("PDF"):
			pdfDirectory = moveDirectory;
			break;
		case("Text"):
			textFileDirectory = moveDirectory;
			break;
		case("Powerpoint"):
			powerpointDirectory = moveDirectory;
			break;
		case("Image"):
			imageDirectory = moveDirectory;
			break;
		case("Excel"):
			excelDirectory = moveDirectory;
			break;
		case("Other"):
			otherDirectory = moveDirectory;
			break;
		}
	}
}
