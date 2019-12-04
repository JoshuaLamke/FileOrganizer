package file_organizer_gui;

import java.nio.file.Path;

public class FileMoverSetUp {
	protected static Path wordDocDirectory;
	protected static Path pdfDirectory;
	protected static Path textFileDirectory;
	protected static Path powerpointDirectory;
	protected static Path imageDirectory;
	protected static Path excelDirectory;
	protected static Path otherDirectory;
	public void registerFileType(Path moveDirectory,String fileType) {
		switch(fileType) {
		case("Word"):
			wordDocDirectory = moveDirectory;
			System.out.println("registered word directory");
			break;
		case("PDF"):
			pdfDirectory = moveDirectory;
		System.out.println("registered pdf directory");
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
