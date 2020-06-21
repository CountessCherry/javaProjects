package com.company;

import java.util.List;

public class ListMultiplicator {
    /**
     Multiplies original list provided numper of times

     @param list list to multiply
     @param n times to multiply, should be zero or greater
     */
    private static <Integer> void multiplyHelper(List<Integer> list, int n) {
        int size = list.size();
        for(int k = 0; k < n-1; k++) {
            for(int i=0; i<size; i++) list.add(list.get(i));
        }

    }
    public static void multiply(List<?> list, int n) {
        multiplyHelper(list, n);
        for( var i : list) System.out.println(i);
        // Add implementation here
    }
}
