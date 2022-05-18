package org.Stepik.Task621;


import java.io.*;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Main {

    public static void main(String[] args) {

        Set<Integer> num1 = new HashSet<>();
        num1.add(3);
        num1.add(7);
        num1.add(9);

        HashSet<Integer> num2 = new HashSet<>();
        num2.add(5);
        num2.add(7);
        num2.add(12);

        Set<Integer> result = symmetricDifferenceIter(num1,num2);
        System.out.println(result);

    }

        public static <T> Set < T > symmetricDifference(Set < ? extends T > set1, Set < ? extends T > set2){
            Set<T> result = new HashSet<>(set1);
            for (T elem : set2){
                if (set1.contains(elem))
                    result.remove(elem);
                else
                    result.add(elem);
            }
            return result;
        }

    public static <T> Set < T > symmetricDifferenceIter(Set < ? extends T > set1, Set < ? extends T > set2){
        Set<T> result = new HashSet<>(set1);
        Iterator< ? extends T > iter = set2.iterator();
        T elem;
        while(iter.hasNext()) {
            elem = iter.next();;
            if (set1.contains(elem))
                result.remove(elem);
            else
                result.add(elem);
        }
        return result;
    }
}