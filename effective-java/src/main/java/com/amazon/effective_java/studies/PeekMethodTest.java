package com.amazon.effective_java.studies;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PeekMethodTest {

    public static void main(String[] args) {
        List<String> numbers = Stream.of("one", "two", "three", "four")
                .filter(e -> e.length() > 3)
                .peek(e -> System.out.println("Filtered value: " + e))
                .map(String::toUpperCase)
                .peek(e -> System.out.println("Mapped value: " + e))
                .collect(Collectors.toList());

        System.out.println("After numbers :");
        for (String number : numbers) {
            System.out.println(number);
        }


        List<Integer> list
                = Arrays.asList(0, 2, 4, 6, 8, 10);

        // Using peek without any terminal
        // operation does nothing
        System.out.println(list.stream().peek(System.out::println).count());
    }
}
