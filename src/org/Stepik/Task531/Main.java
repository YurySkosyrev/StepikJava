package org.Stepik.Task531;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.nio.charset.StandardCharsets;

public class Main {

    public static void main(String[] args){

//        int a = System.in.read();
//        while (a != -1) {
//            System.out.println(a);
//            a = System.in.read();
//        }
        try (Writer writer = new OutputStreamWriter(System.out, StandardCharsets.US_ASCII)) {
            writer.write("а");
        }
        catch (IOException e) {
        }
        }
}