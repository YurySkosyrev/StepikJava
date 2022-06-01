package org.Stepik.Matrix;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = 0;
        String s = "";
        String[] inp;
        while (sc.hasNext()){
            s += sc.nextLine()+ " ";
            x ++;
        }
        inp = s.split(" ");
        int y = inp.length/x;
        String[][] matrix = new String[x][y];
        for (int i = 0; i < x; i++)
        {
            for (int j = 0; j < y; j++)
            {
                matrix[i][j] = inp[i*y+j];
            }
        }

        for (int j = 0; j < y; j++)
        {
            for (int i = 0; i < x-1; i++)
            {
                System.out.print(matrix[i][y-j-1] + " ");
            }
            System.out.println(matrix[x-1][y-j-1]);
        }
    }
}