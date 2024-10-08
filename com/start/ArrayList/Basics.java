package com.start.ArrayList;

import java.util.ArrayList;

public class Basics {
    public static void main(String[] args) {
        int[] ar = {2,3,4};
        ArrayList<Integer> list = new ArrayList<Integer>();
        ArrayList<Integer> l1 = new ArrayList<>();
        l1.add(10);
        l1.add(4);
        l1.add(6);
        list.add(1);
        list.add(4);
        list.add(5);
        System.out.println(list);
        list.add(0,3);
        System.out.println(list);
        list.set(0,2);
        System.out.println(list);
//        System.out.println(list);
//        for (int a = 0;a<list.size();a++){
//            int elem = list.get(a);
//            System.out.println(elem);
//        }
        list.remove(0);
        System.out.println(list);
//        System.out.println(l1);
        list.addAll(1,l1);
        System.out.println(list);
//        list.clear();
//        System.out.println(list);
        System.out.println(list.contains(4));
        System.out.println(list.indexOf(10));
    }
}
