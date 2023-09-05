package main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListClass {

    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();

        /*
         * Add operation adds elements to the list.
         * It maintains insertion order.
         * Time complexity - O(1)
         */
        integerList.add(101);
        integerList.add(102);
        integerList.add(2, 103);
        integerList.add(3, 104);

        printList(integerList);

        /*
         * It returns the size of the list.
         * return type is always integer.
         * Time complexity - O(n)
         */
        int size = integerList.size();
        System.out.println("\n\nThe size of the ArrayList is " + size);

        /*
         * Set operation adds/replaces elements to the list by specific index number.
         * It is similar to add(index, value)
         * Time complexity - O(1)
         */
        integerList.set(0, 201);
        integerList.set(1, 202);

        printList(integerList);

        /*
         * Remove operation removes elements of a specific index from the list.
         * The subsequent elements are shifted after the removal.
         * Time complexity - O(n)
         */
        integerList.remove(0);

        printList(integerList);

        /*
         * We can sort any ArrayList using Collections.sort<list>
         * Time complexity - O(n log(n))
         */
        Collections.sort(integerList);

        printList(integerList);

        /*
         * Clear operation removes all the elements from the list.
         * Time complexity - O(n)
         */
        integerList.clear();

        printList(integerList);
    }

    /**
     * Helper method for printing the list
     *
     * @param list The list to be printed
     */
    private static void printList(List<Integer> list) {
        System.out.println("\n\nPrinting the list");

        for (Integer element : list) {
            System.out.println(element);
        }
    }
}
