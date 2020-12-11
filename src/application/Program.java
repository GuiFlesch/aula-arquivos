package application;

import java.io.*;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a folder path: ");
        String strPath = sc.nextLine();

        File path = new File(strPath);

        File[] folders = path.listFiles(File::isDirectory);
        File[] files = path.listFiles(File::isFile);

        System.out.println("FOLDERS: ");
        for (File folder : folders){
            System.out.println(folder);
        }
        System.out.println("FOLDERS: ");
        for (File file : files) {
            System.out.println(file);
        }

        boolean sucess = new File(strPath + "\\subdir").mkdir();
        System.out.println("Directory created successfully" + sucess);

        sc.close();
    }
}