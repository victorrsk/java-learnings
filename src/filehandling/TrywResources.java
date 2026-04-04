package filehandling;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class TrywResources {

    public static void main(String[] args) {

        try (var obj = new FileWriter("src/filehandling/text.txt", true)) {
            obj.write("try with resources block");
        }
        catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }

}
