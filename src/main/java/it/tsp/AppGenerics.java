package it.tsp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class AppGenerics {
    public static void main(String[] args) {
        // List<String> worlds = Stream.of("ciao", "domani").toList();

        Box<Person> a = new Box<>(new Person("Giorgio", "Armani"));
        System.out.println(a.getElement());

        Integer[] a1 = { 1, 2, 3, 4};
        Integer[] a2 = { 1, 2, 3, 5 };
        System.out.println("\nArray1: \n");
        System.out.println(Arrays.toString(a1));

        System.out.println("\nArray 2: \n");
        System.out.println(Arrays.toString(a2));

        System.out.println(checkArray(a1, a2));
        

        /*
         * List g = new ArrayList<>();
         * g.add("parola");
         * g.add(1);
         * g.add(new Person("mario", "rossi"));
         * System.out.println(g);
         * 
         * for(Object item : g){
         * if (item instanceof Person) {
         * Person p = (Person) item;
         * System.out.println(p.lname());
         * } else {
         * System.out.println(item.toString());
         * }
         * }
         */
    }

    private static <T> boolean checkArray(T[] array1, T[] array2) {
        if (array1.length != array2.length) {
            System.out.println("a1 and a2 haven't the same length.");
            return false;
        }
        System.out.println("a1 and a2 have the same length.");

        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; i < array2.length; i++) {
                if (!array1[i].equals(array2[j])) {
                    System.out.println("a1 and a2 haven't the same elements.");
                    return false;
                } else {
                    System.out.println("a1 and a2 have the same elements.");
                    return true;
                }
                
            }
        }
        return false;
    }

    private static <T extends Number> double somma(T n1, T n2) {
        return n1.doubleValue() + n2.doubleValue();
    }
}

class Box<E> {
    private E element;

    public Box(E element) {
        this.element = element;
    }

    public E getElement() {
        return this.element;
    }
}

record Person(String fname, String lname) {

}
