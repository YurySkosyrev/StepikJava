package org.Stepik.Task522;

import java.io.ByteArrayInputStream;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        byte[] arr = {};
        ByteArrayInputStream inputStream = new ByteArrayInputStream(arr);
        System.setIn(inputStream);

        int a = System.in.read();
        while (a != -1) {
            int b = System.in.read();
            if (a != 13 || b != 10) {
                System.out.println(a);
            }
            a = b;
        }
        System.out.flush();

    }
}