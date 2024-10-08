package com.start.gamePath;
import java.util.*;
import java.lang.Math;

public class ScannerBasics {
    public static void main(String[] args) {
//        Scanner part taking input
//        Scanner s1 = new Scanner(System.in);
//        String name = s1.nextLine();
//        int age = s1.nextInt();
//        System.out.println("My name is "+name+" and my age is "+age);
//        random number generation
        int ran = (int)(Math.random()*100);
//        System.out.println(ran);
//        for loop
//        for (int a=0;a<=ran;a++){
//            System.out.println(a);
//        }
        int a = 10 ;
//        while (a>0){
//            System.out.println("It's grater then 0 the value of a is "+a);
//            --a;
//        }

        do{
            System.out.println("It's grater then 0 the value of a is "+a);
            --a;
        }while (a>0);
    }
}
