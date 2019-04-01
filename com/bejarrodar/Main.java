package com.bejarrodar;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.FileReader;
import java.util.Scanner;

public class Main {

    public static void main(String a[]){
        String fileName;
        StringBuilder sb = new StringBuilder();
        String strLine = "";
        String str_data = "";
        Scanner input = new Scanner (System.in);
        System.out.println("Please Enter File name");
        fileName = input.nextLine();
        try {
            BufferedReader br = new BufferedReader(new FileReader(fileName));
            while (strLine != null)
            {
                if (strLine == null)
                    break;
                str_data += (strLine + "\n");
                strLine = br.readLine();

            }
            System.out.println(str_data);
            br.close();
        } catch (FileNotFoundException e) {
            System.err.println("File not found");
        } catch (IOException e) {
            System.err.println("Unable to read the file.");
        }
    }
}