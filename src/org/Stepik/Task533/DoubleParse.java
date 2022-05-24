package org.Stepik.Task533;


import java.util.Scanner;

public class DoubleParse {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        double sum = 0;
        while (sc.hasNext()){
            try {
                sum += Double.parseDouble(sc.next());
            }
            catch (Exception e) {

            }
        }
        System.out.format("%.6f", sum);
    }

}