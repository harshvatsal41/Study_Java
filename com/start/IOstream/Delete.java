package com.start.IOstream;

import java.io.File;
import java.io.IOException;

public class Delete {
    public static void main(String[] args) {
        File myFile = new File("abc.txt");

        if(myFile.delete()){
            System.out.println("The File name "+myFile.getName()+" has been deleted ");
        }else{
            System.out.println("The File is not deleted !! Some error Occur");
        }
    }
}
