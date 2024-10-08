package com.start.HashMap;
import java.util.*;

public class Basic {
    public static void main(String[] args) {
        HashMap<String,Integer> map = new HashMap<>();
//        Insertion

        map.put("India", 120);
        map.put("Pakistan", 5);
        map.put("Russia", 25);

//        Print
        System.out.println(map);

//
//        int[] a={1,2,43,54,58};
//        for(int val: a){
//            System.out.print(val+" ");
//
//        }
//        for (Map.Entry<String,Integer> e: map.entrySet()){
//            System.out.print(e.getKey()+" ");
//            System.out.println(e.getValue());
//        }
        map.put("India" ,340);
        System.out.println(map.get("India"));
        Set<String> keys = map.keySet();
        for (String key:keys){
            System.out.println(key+" "+map.get(key));
        }
        map.remove("Pakistan");
        System.out.println(map);
        if(map.containsKey("India")){
            System.out.println("The Indian data is here");
        }
        System.out.println(map.get("India"));
    }
}
