/*
 * Write a Java program to calculate the sum of all even, odd numbers in a list using streams. 
 */

package exercise3;

import java.util.Arrays;
import java.util.List;

public class App3 {
    public static void main(String[] args) {
        List<Integer> numList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        System.out.println("\nList of numbers: ");
        numList.stream().forEach(v -> System.out.println(v));
        
        int sumOfEvenIntegers = numList.stream().filter(v -> v%2 == 0).mapToInt(Integer::intValue).sum();
        System.out.println("\nThe sum of all even numbers is of: "+sumOfEvenIntegers);

        int sumOfOddIntegers = numList.stream().filter(v -> v%2 != 0).mapToInt(Integer::intValue).sum();
        System.out.println("\nThe sum of all odd numbers is of: "+sumOfOddIntegers);
        
    }
}
