package com.start.IOstream;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ReadFile {
    public static void main(String[] args) {
        File myFile = new File("abc.txt");
        try{
            Scanner sc = new Scanner(myFile);
            while(sc.hasNextLine()){
                System.out.println(sc.nextLine());
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
