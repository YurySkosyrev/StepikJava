package org.Stepik.Task643;


import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

import static java.util.function.UnaryOperator.identity;
import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;

public class Main {

    public static void main(String[] args) {

        String strTest1 = "Мама мыла-мыла-мыла раму!";

        String strTest2 = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed sodales consectetur" +
                " purus at faucibus. Donec mi quam, tempor vel ipsum non, faucibus suscipit massa. Morbi" +
                " lacinia velit blandit tincidunt efficitur. Vestibulum eget metus imperdiet sapien laoreet" +
                " faucibus. Nunc eget vehicula mauris, ac auctor lorem. Lorem ipsum dolor sit amet, consectetur" +
                " adipiscing elit. Integer vel odio nec mi tempor dignissim.";


        BufferedReader bf = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(strTest2.getBytes()),
                StandardCharsets.UTF_8));
        Map <String, Long> result = bf
                // reader to Stream of <String>
                .lines()
                // split each strings from stream into array of words using regexp
                .map(line -> line.toLowerCase().split("[^\\p{L}\\p{Digit}]+")).flatMap(Arrays::stream)
                .collect(groupingBy(identity(), counting()));

        Map<String, Long> finalMap = new LinkedHashMap<>();

        //Sort a map and add to finalMap
        result.entrySet().stream()
                .sorted(Map.Entry.<String, Long>comparingByValue()
                        .reversed()).forEachOrdered(e -> finalMap.put(e.getKey(), e.getValue()));

        finalMap.entrySet().stream().limit(10).forEach(x -> System.out.println(x.getKey()));




//        Map<String, Long> counted = list.stream()
//                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
    }

}