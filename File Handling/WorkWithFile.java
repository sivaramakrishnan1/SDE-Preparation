import java.util.Scanner;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

class WorkWithFile {
    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("D:\\SDE-Preparation\\Zoho\\Level 3\\File Handling\\newFile.txt", true);
            String content = "Naama jeichitom maara!";

            writer.write('\n');

            for (char c : content.toCharArray()) {
                writer.write(c);
            }

            writer.close();
        } catch (IOException e) {
            System.out.print("Some error : " + e);
        }
    }
}

/*
 * Creates 5 empty file
 * try
 * {
 * for(int i=0 ; i < 5 ; i++)
 * {
 * path = path1 + i + path2;
 * File file = new File(path);
 * if (file.createNewFile())
 * {
 * System.out.println("Created new file. Available at : " +
 * file.getCanonicalPath());
 * }
 * else
 * {
 * System.out.println("Already exist! Available at : " +
 * file.getCanonicalPath());
 * 
 * }
 * }
 * } catch (IOException e) {
 * System.out.println("Some error : " + e);
 * }
 * 
 */

/**
 * *Create file
 * File file = new File("D:\\SDE-Preparation\\Zoho\\Level 3\\File Handling\\newFile.txt");
            if (file.createNewFile()) {
                System.out.println("Created new file. Available at : " + file.getCanonicalPath());
            } else {
                System.out.println("Already exist! Available at : " + file.getCanonicalPath());
            }
 */

/*
 *  Cpoying files to another files
        FileReader reader = new FileReader("D:\\SDE-Preparation\\Zoho\\Level 3\\File Handling\\WorkWithFile.java");
        FileWriter writer = new FileWriter("D:\\SDE-Preparation\\Zoho\\Level 3\\File Handling\\newFile.txt");

        int c;
        while ((c = reader.read()) != -1) {
            writer.write((char)c);
        }
        reader.close();
        writer.close();
*/