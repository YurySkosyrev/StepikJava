package org.Stepik.Sweeper;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

                Scanner sc = new Scanner(System.in);
                int x = sc.nextInt();
                int y = sc.nextInt();
                int mineX, mineY;
                int [][] field = new int[x][y];
                int mines = sc.nextInt();
                int [][] coord = new int[mines][2];
                for (int i =0; i < mines; i++)
                {
                    coord[i][0] = sc.nextInt()-1;
                    coord[i][1] = sc.nextInt()-1;
                }

                for (int i =0; i < mines; i++)
                {
                     mineX = coord[i][0];
                     mineY = coord[i][1];
                     field[mineX][mineY]=-1;
                }

                for (int i = 0; i < x; i++)
                {
                    for (int j = 0; j < y; j++)
                    {
                        if (field[i][j] == -1) {
                            for (int k = i - 1; k <= i + 1; k++){
                                for (int l = j - 1; l <= j + 1; l++){
                                    if (check(k, l, x, y)){
                                        if (field[l][k] != -1) field[l][k] ++;
                                    }
                                }
                            }
                        }
                    }
                }

        for (int i = 0; i < x; i++)
        {
            for (int j = 0; j < y; j++)
            {
                if (field[i][j] == -1) {
                    System.out.print("m ");
                }else{
                    System.out.print(field[i][j] + " ");
                }
            }
            System.out.println();
        }



        }
    static boolean check(int i, int j, int n, int m){
        return i >= 0 && i < n && j >= 0 && j < m;
    }
}
