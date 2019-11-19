/**
 * @author William Hiranpat
 * Analyze file extension and returns it. If there is no extension, let the user know that there is no extension.
 */

import java.io.file;

public class FileAnalyzer{
    private static String fileAnalyze(File file) throws {
        String extention = "";

            if (file != null && file.exists()){
                String name = file.getName();
                extension = name.substring(name.lastIndexOf(".");)
            }
            else{
                throw new NoExtensionException("No extension found.");
            }

        return extension;
    }
}