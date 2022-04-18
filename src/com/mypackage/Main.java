package com.mypackage;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        short a, b;
        int c;

        System.out.println("Введите 1 число");
        a = scan.nextShort();
        System.out.println("Введите 2 число");
        b = scan.nextShort();
        c = a + b;
        System.out.print(c);
    }
}