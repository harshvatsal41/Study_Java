package com.start.Harsh;

class Vehicle{
    String name;
    String breaks;
    int efficiency;
    public void info(){

        System.out.println("I am the info part placed in Vehicle class");
    }

}
class car extends Vehicle{
    @Override
    public void info(){
        System.out.println("I am the info part placed in Car class");
    }
}

public class Age {
    public static void main(String[] args) {
        car maruti = new car();
        maruti.name = "Brezza";
        maruti.efficiency= 18;
        maruti.info();
    }
}
