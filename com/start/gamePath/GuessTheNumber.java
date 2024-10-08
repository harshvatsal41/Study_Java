package com.start.gamePath;
import java.util.*;
import java.lang.Math;
public class GuessTheNumber {
    public static void main(String[] args) {
        int ranNumber = (int)(Math.random()*50);
//        System.out.println(ranNumber);
        Scanner s1 = new Scanner(System.in);
        int UserGuess;
        System.out.println("You guys are having 5 chances be careful  ️😊😁!!!!!!!!!!!!!");
        for(int i=1;i<=5;i++){
            System.out.println("It's you " + i + " Turn");
            UserGuess = s1.nextInt();
            if(UserGuess==ranNumber){
                System.out.println("Great $$ You nailed it bruh,right guess");
                break;
            }
            else {
                if(UserGuess>ranNumber){
                    System.out.println("Wrong!!🥲You have guessed greater number");
                }else {
                    System.out.println("Wrong!!🥲You have guessed smaller number");
                }
            }
        }
    }
}
