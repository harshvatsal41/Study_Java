package com.start.Recursion;

public class SumOfN {
    public static void printSum(int big,int end,int sum){
        if(big==end){
            sum+=big;
            System.out.println(big);
            System.out.println("The sum is "+sum);

        }
//        System.out.println(big);
        sum+=big;
        printSum(big+1, end,sum);
        System.out.println(big);

    }
    public static void main(String[] args) {
        printSum(1,5,0);
    }
}
