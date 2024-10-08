package com.start.patterns;

public class FirstQuestion {
    public static void main(String[] args) {
        int[][] array = {{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20},{21,22,23,24,25}};
        for (int a=0;a<5;a++){
            for(int b=0;b<5;b++){
                System.out.print(array[a][b]+" ");
            }
            System.out.println();
        }
        for (int a=0;a<5;a++){
            for(int b=0;b<5;b++) {
                if (a == 0 || a == 4 || b == 0 || b == 4) {
                    System.out.print(array[a][b]+" ");
                }
            }
        }
    }
}
