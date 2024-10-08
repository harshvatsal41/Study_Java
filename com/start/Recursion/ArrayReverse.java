package com.start.Recursion;

public class ArrayReverse {
    public static void reverse(int[] n,int a){
        if(a>(n.length/2)){
            for (int b = 0;b<n.length;b++){
                System.out.print(n[b]+" ");
            }
            return;
        }
//        System.out.println("This iis Before");
//        for (int b = 0;b<n.length;b++){
//            System.out.print(n[b]+" ");
//        }
//        System.out.println();
        int c = n[a];
        n[a]=n[n.length-1-a];
        n[n.length-1-a]=c;
//        System.out.println("This iS after");
//        for (int b = 0;b<n.length;b++){
//            System.out.print(n[b]+" ");
//        }
//        System.out.println();
        reverse(n, a+1);


    }
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,6,7};
        reverse(a,0);
    }
}
