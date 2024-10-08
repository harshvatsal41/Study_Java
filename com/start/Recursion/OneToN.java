package com.start.Recursion;

public class OneToN {
    public static void printNum(int i,int n){
        if(i>n){
            return;
        }
        System.out.println(i);
        printNum(i+1,n);
    }
    public static void main(String[] args) {
        printNum(1,5);
    }
}
