package LearningJava;

import java.io.File;
import java.io.IOException;

public class FileTest {

    public static void main(String[] args) {
        File fileCurrentData = new File("D:\\FilesJava\\ass");
        Integer a = 6;
        int b = 6;


        try {
            fileCurrentData.mkdir();
            if (fileCurrentData.mkdir()) {
                System.out.println("Folder has created");
            } else {
                System.out.println("Folder isn't created");
            }

        } catch (SecurityException e) {
            e.printStackTrace();
        }


        try {
            File fileText = new File("D:\\FilesJava", "test1.txt");
            fileText.createNewFile();
            if (fileText.createNewFile()) {
                System.out.println("File has created");
            } else {
                System.out.println("File isn't created");
            }


        } catch (IOException | SecurityException e) {
            e.fillInStackTrace();
        }

        try {
            Thread.sleep(4000);
        } catch (IllegalArgumentException | InterruptedException e) {
            e.printStackTrace();
        }

        //fileCurrentData.delete();
    }
}
