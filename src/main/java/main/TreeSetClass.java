package main;

import java.util.List;
import java.util.TreeSet;

public class TreeSetClass {

    public static void main(String[] args) {
        TreeSet<Integer> treeSet = new TreeSet<>();

        /*
         * Add operation adds elements to the hash set.
         * Doesn't maintain insertion order.
         * Elements are sorted upon insertion.
         * Time complexity - O(log(n))
         */
        treeSet.add(5);
        treeSet.add(2);
        treeSet.add(3);
        treeSet.add(4);
        treeSet.add(1);

        printSet(treeSet);

        /*
         * It returns the size of the tree set.
         * Return type is always integer.
         * Time complexity - O(1)
         */
        int size = treeSet.size();
        System.out.println("\n\nThe size of the TreeSet is " + size);

        /*
         * Remove operation removes elements from the tree set.
         * Time complexity - O(log(n))
         */
        treeSet.remove(3);
        treeSet.remove(1);

        printSet(treeSet);

        /*
         * Checks if the tree set contains particular element
         * Time complexity - O(log(n))
         */
        boolean contains = treeSet.contains(2);
        System.out.println("\n\nThe result of contain is - " + contains);

        /*
         * Checks if the tree set contains all the mentioned elements
         * Time complexity - O(n log(n))
         */
        boolean containsAll = treeSet.containsAll(List.of(1, 2));
        System.out.println("\n\nThe result of contain is - " + containsAll);

        /*
         * Clear operation removes all the elements from the tree set.
         * Time complexity - O(n log(n))
         */
        treeSet.clear();

        printSet(treeSet);
    }

    /**
     * Helper method for printing the tree set
     *
     * @param treeSet The tree set to be printed
     */
    private static void printSet(TreeSet<Integer> treeSet) {
        System.out.println("\n\nPrinting the set");

        for (Integer element : treeSet) {
            System.out.println(element);
        }
    }
}
