package org.Stepik.Task532;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Optional;

public class InTest {
    public static void main(String[] args) throws Exception{
        InputStream inByte = new ByteArrayInputStream(new byte[]{48, 49, 50, 51});

        System.out.println(readAsString(inByte, StandardCharsets.UTF_8));

    }    public static String readAsString(InputStream inputStream, Charset charset) throws Exception {
        Reader reader = new InputStreamReader(inputStream, charset);
        StringBuilder sb = new StringBuilder();
        int b = reader.read();
        while (b != -1) {
            sb.append((char)b);
            b = reader.read();
        }
        return sb.toString();

    }

//    public class Example<X> {
//        public void someMethod(Object obj) {
//            Optional<X> x = Optional.empty();
//            X x1 = (X)obj;
//            X[] x2 = new X[10];
//            boolean f = obj instanceof X;
//            X x4 = new X();
//            boolean i = obj instanceof Optional<X>;
//        }
//    }
}