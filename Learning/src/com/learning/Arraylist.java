package com.learning;

import java.util.LinkedList;
import java.util.List;

public class Arraylist {
    public static void main(String[] args) {
        List<Integer> l = new LinkedList<>();
        l.add(0);
        l.add(1);
        l.add(2);
        l.add(3);
        l.add(4);
        l.remove(2);
        System.out.println(l);
    }
}
