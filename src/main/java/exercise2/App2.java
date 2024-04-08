/*
 * Write a Java program to convert a list of strings to uppercase or lowercase using streams. 
 */

package exercise2;

import java.util.Arrays;
import java.util.List;

public class App2 {
    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("Ciao", "Gatto", "somaro", "GIarDiNO");
        System.out.println("\nString list beafore filtering: ");
        stringList.stream().forEach(System.out::println);
        
        System.out.println("\nString list after filtering toUpperCase: ");
        stringList.stream().forEach(v -> System.out.println(v.toUpperCase()));
        
        System.out.println("\nString list after filtering toLowerCase: ");
        stringList.stream().forEach(v -> System.out.println(v.toLowerCase()));
        
    }
}
