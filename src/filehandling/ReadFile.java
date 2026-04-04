package filehandling;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ReadFile {

    public static void main(String[] args) {
        File file = new File("src/filehandling/text.txt");
        Scanner sc = null;

        try {
            sc = new Scanner(file);
            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }
        }
        catch (IOException e) {
            System.out.println(e.getMessage());
        }
        catch (NullPointerException e) {
            System.out.println("scanner is null: " + e.getMessage());
        }
        catch (Exception e) {
            System.out.println("Some error...");
        }
        finally {
            if (sc != null) {
                sc.close();
            }
        }
    }

}
