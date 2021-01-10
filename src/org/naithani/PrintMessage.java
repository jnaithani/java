package org.naithani;

import java.util.Arrays;
import java.util.stream.Stream;

public class PrintMessage
{
    private static String message[] = {
        "It is time,", 
        "for all good men and women,", 
        "to come to the aid of their country."
    };

    Stream<String> stream 
            = Stream.of(
                "It is time,", 
                "for all good men and women,", 
                "to come to the aid of their country."
                );

    private void printMessageMethodReference()
    {
        Arrays.stream(message).forEach(System.out::println);
    }

    private void printeMessageLambda()
    {
        Arrays.stream(message).forEach( s -> System.out.println(s));
    }

    private void printMessageStream()
    {
        stream.forEach(s -> System.out.println(s)); 
    }

    public static void main(String[] args)
    {
        PrintMessage printElements = new PrintMessage();
        
        printElements.printMessageMethodReference();

        printElements.printeMessageLambda();

        printElements.printMessageStream();
    }
}