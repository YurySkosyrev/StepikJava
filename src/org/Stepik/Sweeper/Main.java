package org.Stepik.Sweeper;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

                Scanner sc = new Scanner(System.in);
                int x = sc.nextInt();
                int y = sc.nextInt();
                int mines = sc.nextInt();
                int [][] coord = new int[mines][];
                for (int i =0; i < 3; i++)
                {
                    coord[i][0] = sc.nextInt();
                    coord[i][1] = sc.nextInt();
                }
        }
}
