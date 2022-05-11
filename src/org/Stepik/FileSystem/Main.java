package org.Stepik.FileSystem;
import java.awt.*;
import java.io.*;
import java.net.URISyntaxException;

public class Main {
    public static void main(String[] args) throws IOException, URISyntaxException, AWTException {
        // работа с текстовым файлами
        Reader reader = new FileReader("C:\\Java\\StepikJava\\src\\temp.txt");
        int i = 0;
        while ((i = reader.read()) != -1) {
            System.out.println((char)i);
        }
        Writer writer;

        // работа с байтовыми файлами
        InputStream inputStream;
        OutputStream outputStream;

    }
}
