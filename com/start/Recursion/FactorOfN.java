package com.start.Recursion;

public class FactorOfN {
    public static int calcfactorial(int n){
        if(n==0||n==1){
            return 1;
        }
        int fact_nm=calcfactorial(n-1);
        int fact = n * fact_nm;
        return fact;
    }
    public static void main(String[] args) {
        int n = calcfactorial(5);
        System.out.println(n);
    }
}
