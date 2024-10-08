package com.start.Variables;

import org.w3c.dom.Node;

import java.util.Scanner;
class RajuProf{
    public static void main(String[] args) {
        System.out.println("kaise ho bhaya");
    }
    static String ingredients = "Masala";
    public static void masalachai(){
        System.out.println("Ye chai hai"+ingredients);
    }
}

public class RajuBhaiya{
    public static void chai(){
        System.out.println("Chai peelo");
    }
    public static void main(String[] args) {
//    String name = "Harsh Vatsal";
//        int b = 20;
//        int age = 28;
//        byte age2 = 30;
//        long ab = 8860313182L;
//        double price = 25.78;
//        float f1 = 26.31F;
//        char letter = '@';
//        boolean isINT = true;
        System.out.print("provide your name here : ");
        Scanner xyz = new Scanner(System.in);
        String name = xyz.nextLine();
        System.out.print("provide your age here : ");
        int age1 = xyz.nextInt();

        System.out.println(name+" is "+age1+" old");
    }
}
