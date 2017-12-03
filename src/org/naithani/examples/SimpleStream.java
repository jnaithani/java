package org.naithani.examples;

import java.util.Arrays;
import java.util.List;

public class SimpleStream
{
    public static void main(String[] args)
    {
        SimpleStream ss = new SimpleStream();

        ss.process();
    }

    private void process()
    {
        List<String> myList = Arrays.asList("k1", "l1", "m2", "m3", "j4", "j4", "j1", "m1");

        myList.stream().filter(s -> s.endsWith("1")).sorted().forEach(System.out::println);
        
        myList.stream().filter(s -> s.startsWith("m")).map(String::toUpperCase).sorted().forEach(System.out::println);
    }
}
