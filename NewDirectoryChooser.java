import java.nio.file.Path;
import java.nio.file.Paths;
import file_organizer_gui.FileMoverSetUp;
public class NewDirectoryChooser{  
  public String fileType;
  
  public NewDirectoryChooser(String fileType){
    this.fileType = fileType;
  }
  
  public Path choose(){
    if ((fileType.equals("xls")) || (fileType.equals("ods")) || (fileType.equals("xlr")) || (fileType.equals("xlsx"))){
      return FileMoverSetUp.excelDirectory;
    }
    else if ((fileType.equals("key")) || (fileType.equals("odp")) || (fileType.equals("pps")) || (fileType.equals("ppt")) || (fileType.equals("pptx"))){
      return FileMoverSetUp.powerpointDirectory;
    }
    else if ((fileType.equals("ai")) || (fileType.equals("bmp")) || (fileType.equals("gif")) || (fileType.equals("ico")) || (fileType.equals("jpg")) || (fileType.equals("jpeg")) || (fileType.equals("png")) || (fileType.equals("ps")) || (fileType.equals("psd")) || (fileType.equals("svg")) || (fileType.equals("tif")) || (fileType.equals("tiff"))){
      return FileMoverSetUp.imageDirectory;
    }
    else if ((fileType.equals("doc")) || (fileType.equals("docx")) || (fileType.equals("odt")) || (fileType.equals("wks")) || (fileType.equals("wps")) || (fileType.equals("wpd"))){
      return FileMoverSetUp.wordDocDirectory;
    }
    else if ((fileType.equals("txt")) || (fileType.equals("rtf")) || (fileType.equals("odt"))){
      return FileMoverSetUp.textFileDirectory;
    }
    else if (fileType.equals("pdf")){
      return FileMoverSetUp.pdfDirectory;
    }
    else {
      return FileMoverSetUp.otherDirectory;
    }
  }
}
