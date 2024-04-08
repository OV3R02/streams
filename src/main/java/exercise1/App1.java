/*
 * Write a Java program to calculate the average of a list of integers using streams. 
 */

package exercise1;

import java.util.Arrays;
import java.util.List;

public class App1 {
    public static void main(String[] args) {

        List<Integer> numList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

        System.out.println(numList.stream()
                .mapToDouble(Integer::doubleValue)
                .average()
                .orElse(0.0));

    }
}
