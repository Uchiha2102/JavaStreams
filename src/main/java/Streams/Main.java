package Streams;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import static java.util.Locale.filter;


public class Main {

public static void main(String[] args) {

    List<Integer> numbers = new ArrayList<>(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));

    List<Integer> doubledNumbers = numbers.stream()

            .filter(number -> number % 2 == 0)
            .map(number -> number * 2)
            .sorted()
            .collect(Collectors.toList());
    System.out.println("filtered Numbers: " + doubledNumbers);

    int sum = doubledNumbers.stream()
            .mapToInt(i -> i)
            .sum();

    System.out.println("Sum " + sum);
}
}
