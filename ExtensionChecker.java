package file_organizer_gui;
import java.nio.file.Path;

public class ExtensionChecker {
	private String extension;
public ExtensionChecker(Path p){
	extension = extensionGetter(p);
	
}
private String extensionGetter(Path p) {
	if(p.toString().length()!=0) {
	String extension = p.toString();
	int i = extension.lastIndexOf('.');
	extension = extension.substring(i+1);
	return extension;
	}
	else {
		return null;
	}
}
public String getExtension() {
	return extension;
}
}
