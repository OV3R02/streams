package com.it.ciac;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

public class App {
    public static void main(String[] args) throws IOException {
        List<String> words = Files.readAllLines(Paths.get("C:\\Users\\utentepc\\Documents\\words.txt"));
        words.forEach(v -> System.out.println(v));

        System.out.println("\nNumber of streams elements: \n");
        System.out.println(words.stream().count());

        System.out.println("\nNumber of words major of 5: \n");
        System.out.println(words.stream().filter(v -> v.length() > 5).count());

        System.out.println("\nOrdering elements: \n");
        words.stream().sorted().forEach(v -> System.out.println(v));

        System.out.println("\nLength of the biggest word: \n");
        System.out.println(words.stream().mapToInt(v -> v.length()).max().getAsInt());

        System.out.println("\nLength of the smallest word: \n");
        System.out.println(words.stream().mapToInt(v -> v.length()).min().getAsInt());

        System.out.println("\nAverage of words: \n");
        System.out.println(words.stream().mapToInt(v -> v.length()).average().getAsDouble());

        System.out.println("\nPrint without duplicated words: \n");
        words.stream().distinct().forEach(v -> System.out.println(v));

        System.out.println("\nSearch for the \"Pane\" words and return true or false: \n");
        System.out.println(words.stream().anyMatch(v -> v.contains("pane")));

        System.out.println("\nTutte le parole hanno lunghezza >= 4: \n");
        System.out.println(words.stream().allMatch(v -> v.length() >= 4));

        System.out.println("S\nearch and find \"pane\" word\n");
        words.stream()
                .filter(v -> v.contains("pane"))
                .forEach(v -> System.out.println(v));

        System.out.println("\nCollection of words with the same length: \n");
        System.out.println(words.stream()
                .collect(Collectors.groupingBy(v -> v.length())));

        System.out.println("\nCounting words for each collection: \n");
        System.out.println(words.stream()
                .collect(Collectors.groupingBy(v -> v.length(), Collectors.counting())));

        System.out.println("\nWich word contains the letter \"p\"? \n");
        words.stream().forEach(v -> System.out.println(v+" -> "+v.contains("p")));
        

    }
}
