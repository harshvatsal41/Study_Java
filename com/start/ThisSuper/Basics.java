package com.start.ThisSuper;

class one{
    int a;

    public int getA() {
        return a;
    }

    one(int a){
        this.a = a;
        System.out.println("I am Auto Constructor");
    }
}
class two extends one{
    two(int c){
        super(c);
        c = this.a;

    }

}


public class Basics {
    public static void main(String[] args) {
//        one a = new one();
        two b = new two(3);
    }
}
