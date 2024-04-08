/*
 * Write a Java program to remove all duplicate elements from a list using streams. 
 */

package exercise4;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class App4 {
    public static void main(String[] args) {
        
        List<String> list1 = Arrays.asList("sono", "ciao", "miglio", "SERPENTE", "sono", "rana", "fagiolo", "rana");
        System.out.print("Original List = "+list1);
        
        List<String> listWithoutDuplicates = list1.stream().distinct().collect(Collectors.toList());
        System.out.println("\nList without duplicates: "+listWithoutDuplicates);
    }
}
