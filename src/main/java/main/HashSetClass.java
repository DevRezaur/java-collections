package main;

import java.util.HashSet;
import java.util.List;

public class HashSetClass {

    public static void main(String[] args) {
        HashSet<Integer> hashSet = new HashSet<>();

        /*
         * Add operation adds elements to the hash set.
         * Doesn't maintain insertion order.
         * Time complexity - O(1)
         */
        hashSet.add(5);
        hashSet.add(2);
        hashSet.add(3);
        hashSet.add(4);
        hashSet.add(1);

        printSet(hashSet);

        /*
         * It returns the size of the hash set.
         * Return type is always integer.
         * Time complexity - O(1)
         */
        int size = hashSet.size();
        System.out.println("\n\nThe size of the HashSet is " + size);

        /*
         * Remove operation removes elements from the hash set.
         * Since the internal data structure of hash set is hashmap,
         * There is no need to shift the subsequent elements after the removal.
         * Time complexity - O(1)
         */
        hashSet.remove(3);
        hashSet.remove(1);

        printSet(hashSet);

        /*
         * Checks if the hash set contains particular element
         * Time complexity - O(1)
         */
        boolean contains = hashSet.contains(2);
        System.out.println("\n\nThe result of contain is - " + contains);

        /*
         * Checks if the hash set contains all the mentioned elements
         * Time complexity - O(n)
         */
        boolean containsAll = hashSet.containsAll(List.of(1, 2));
        System.out.println("\n\nThe result of contain is - " + containsAll);

        /*
         * Clear operation removes all the elements from the hash set.
         * Time complexity - O(n)
         */
        hashSet.clear();

        printSet(hashSet);
    }

    /**
     * Helper method for printing the hash set
     *
     * @param hashSet The hash set to be printed
     */
    private static void printSet(HashSet<Integer> hashSet) {
        System.out.println("\n\nPrinting the set");

        for (Integer element : hashSet) {
            System.out.println(element);
        }
    }
}
