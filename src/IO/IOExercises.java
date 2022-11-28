package IO;

import java.io.File;
import java.io.IOException;

public class IOExercises {
    public static void main(String[] args) throws IOException {
        File file = new File("test.txt");
        file.createNewFile();

        File directory = new File("testdirectory" + File.separator + "nestedtestdirectory");
        directory.mkdirs();

        File directory2 = new File("testdirectory" + File.separator + "nestedtestdirectory", "newtest.txt");
        if (!directory2.exists()) {
            directory2.createNewFile();
        }
    }
}
