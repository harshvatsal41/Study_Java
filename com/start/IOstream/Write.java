package com.start.IOstream;

import java.io.FileWriter;
import java.io.IOException;

public class Write {
    public static void main(String[] args) {
        try{
            FileWriter fr = new FileWriter("abc.txt");
            fr.write("This is our first file we are writing in \n Hasta ala Vista");
            fr.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
