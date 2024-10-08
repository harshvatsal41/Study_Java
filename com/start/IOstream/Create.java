package com.start.IOstream;

import java.io.File;
import java.io.IOException;

public class Create {
    public static void main(String[] args) {
        File myFile = new File("abc.txt");
        try {
            boolean newFile = myFile.createNewFile();
            System.out.println(newFile);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
