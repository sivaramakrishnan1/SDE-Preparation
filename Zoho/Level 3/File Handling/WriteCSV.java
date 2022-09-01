import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * CSV = Comma Separated Values
 * 
 * This program should read and write a CSV file. 
 * It should read like matrix. read(1 , 3) should return 3rd cell/value in 1st line.
 *  
 */

public class WriteCSV {

    public static void main(String[] args) 
    {
        try
        {
            Scanner s = new Scanner(System.in);
            File csv = new File("D:\\SDE-Preparation\\Zoho\\Level 3\\File Handling\\csv.csv");
            if (csv.createNewFile()) {
                System.out.println("File created \n\n");
            } else {
                System.out.println("File opened \n\n");
            }

            FileWriter writer = new FileWriter("D:\\SDE-Preparation\\Zoho\\Level 3\\File Handling\\csv.csv", true);
            int columsn = s.nextInt();
            int rows = s.nextInt();
            for(int i = 0 ; i < columsn ; i++){
                for(int j = 0 ; j < rows ; j++)
                {
                    writer.write(s.next() + ",");
                }
                writer.write("\n");
            }

            writer.close();
            s.close();
        } catch (IOException e) {
            e.printStackTrace();
        }



        /* int choice = 0;
        while(choice != 3)
        {
            System.out.println("1. Print Value");
            System.out.println("2. Add value");
        } */
    }
/*
    String readValue()
    {

    }

    void writeLineValue(String line)
    {

    }

    void replaceValue(String value)
    {

    }*/
}
