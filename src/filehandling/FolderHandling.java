package filehandling;

import java.io.File;

public class FolderHandling {
    public static void main(String[] args) {
        File folder = new File("src/filehandling/");

        System.out.println(folder.isDirectory());
        System.out.println(folder.isFile());
        folder.mkdirs();
        System.out.println(folder.exists());
        String[] arr = folder.list();
        File[] files = folder.listFiles();

        System.out.println(folder.getName());
        System.out.println(folder.getParentFile());
    }
}
