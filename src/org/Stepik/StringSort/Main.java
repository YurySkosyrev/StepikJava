package org.Stepik.StringSort;
import java.awt.*;
import java.io.*;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException, URISyntaxException, AWTException {
        Scanner sc = new Scanner(System.in);
        ArrayList <String> st = new ArrayList<>();
        while (sc.hasNext()) {
            st.add(sc.next());
        }
        st.sort((s1, s2) -> {
            return s1.compareTo(s2);
        });
        for (String s : st){
            System.out.println(s);
        }
    }
}
