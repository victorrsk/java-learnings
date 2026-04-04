package filehandling;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterClass {

    public static void main(String[] args) {

        FileWriter fw = null;

        try {
            fw = new FileWriter("src/filehandling/text.txt", true);
            fw.write("New file content\n");
        }
        catch (IOException e) {
            System.out.println(e.getMessage());
        }
        finally {
            if (fw != null) {
                try {
                    fw.close();
                }
                catch (IOException e) {
                    System.out.println("Some error");
                }
            }
        }
    }

}
