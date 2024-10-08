
package pathexample;

import java.nio.file.Path;
import java.nio.file.Paths;

public class PathExample {
    public static void main(String[] args) {
        // Create a Path object
        //You may have to alter the file path
        Path path = Paths.get("C:\\Users\\dengovender\\Downloads\\PathExample");

        // Get file name and parent directory
        System.out.println("File Name: " + path.getFileName());
        System.out.println("Parent Directory: " + path.getParent());

        // Convert to absolute path
        Path absolutePath = path.toAbsolutePath();
        System.out.println("Absolute Path: " + absolutePath);
    }
}
