package com.start.polymorphism;

import org.w3c.dom.ls.LSOutput;

interface GPS{
     default void Location(){
         System.out.println("M idhar Hai");
     }
}
interface camera{
    void takePictures();
    void RecordVideos();
      private void Greet(){
        System.out.println("Hello You can record Now");
    }

    default void record4KVideos(){
        Greet();
        System.out.println("Recording  the 4K video");
    }
}
class cellPhone{
    void callNumber(int PhoneNumber){
        System.out.println("Calling "+PhoneNumber);
    }
    void pickCalls(){
        System.out.println("Connecting....      ");
    }
}
class mySmartPhone extends cellPhone implements camera,GPS{
    private String Model;
    @Override
    public void takePictures() {

    }

    @Override
    public void RecordVideos() {

    }
}


public class Inherit{
    public static void main(String[] args) {
        mySmartPhone Iphone = new mySmartPhone();
        Iphone.record4KVideos();
    }
}
