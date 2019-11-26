package directory_watching;

import java.io.IOException;
import java.nio.file.Path;

public class DirectoryRegisterer {
public static void registerDirectory(Path p,boolean recursive) {
	try {
		DirectoryWatcher dw = new DirectoryWatcher(p,recursive);
	} catch (IOException e) {
		e.printStackTrace();
	}
}
}
