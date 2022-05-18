package org.Stepik.Task622;


import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        LinkedList<Integer> deq = new LinkedList<Integer>();
        int i = 0;
        while (s.hasNextInt()){
            int x = s.nextInt();
            if (i % 2 == 1)
                deq.addFirst(x);
            i ++;
        }
        for (Integer elem : deq) {
            System.out.print(elem.toString() + " ");
        }
    }

}