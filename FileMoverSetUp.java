package file_organizer_gui;

import java.nio.file.Path;

public class FileMoverSetUp {
	protected Path wordDocDirectory;
	protected Path pdfDirectory;
	protected Path textFileDirectory;
	protected Path powerpointDirectory;
	protected Path imageDirectory;
	protected Path excelDirectory;
	protected Path otherDirectory;
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
