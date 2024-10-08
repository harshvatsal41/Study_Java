package com.start.stringsArrays;

import java.util.Arrays;
import java.util.Scanner;
class play{
    public void flip(int a,int b){
        a = 4;
        b = 7;
        int c = b;
        b = a;
        a = c;
    }
}

public class OneDArray {

    public static void main(String[] args) {
        StringBuilder a = new StringBuilder("Harsh");
        a.delete(0,1);
        a.insert(0, 'S');
        a.setCharAt(0, 'S');
        System.out.println(a);

    }
}
