package com.start.HarshSet;

import java.util.HashSet;
import java.util.*;

public class Basics {
    public static void main(String[] args) {
//        create
        HashSet<Integer> set = new HashSet<>();


        // Adding
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(2);


        //Search-Contains
        if(set.contains(1)){
            System.out.println("It contains 1");
        }
        if(!set.contains(6)){
            System.out.println("It doesn't contain that part");
        }

        //Delete
        set.remove(1);
        System.out.println(set);

        set.add(1);
        set.add(5);
        //Interators

        Iterator it = set.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }

    }
}
