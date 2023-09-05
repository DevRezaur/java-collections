package main;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class LinkedListClass {

    public static void main(String[] args) {
        LinkedList<Integer> integerLinkedList = new LinkedList<>();

        /*
         * Add operation adds elements to the linked list.
         * It maintains insertion order.
         * Time complexity - O(1)
         */
        integerLinkedList.add(101);
        integerLinkedList.add(102);

        /*
         * Adds elements to the linked list by index number.
         * Time complexity - O(n)
         */
        integerLinkedList.add(2, 103);
        integerLinkedList.add(3, 104);

        printList(integerLinkedList);

        /*
         * It returns the size of the linked list.
         * return type is always integer.
         * Time complexity - O(1)
         */
        int size = integerLinkedList.size();
        System.out.println("\n\nThe size of the LinkedList is " + size);

        /*
         * Set operation adds/replaces elements to the linked list by specific index number.
         * It is similar to add(index, value)
         * Time complexity - O(n)
         */
        integerLinkedList.set(0, 201);
        integerLinkedList.set(1, 202);

        printList(integerLinkedList);

        /*
         * Remove operation removes elements of a specific index from the linked list.
         * The subsequent elements are shifted after the removal.
         * Time complexity - O(n)
         */
        integerLinkedList.remove(0);

        printList(integerLinkedList);

        /*
         * We can sort any LinkedList using Collections.sort<list>
         * Time complexity - O(n log(n))
         */
        Collections.sort(integerLinkedList);

        printList(integerLinkedList);

        /*
         * Adds element to the first position of the linked list.
         * And shifts all the subsequent elements.
         * Time complexity - O(1)
         */
        integerLinkedList.addFirst(100);

        printList(integerLinkedList);

        /*
         * Adds element to the last position of the linked list.
         * Time complexity - O(1)
         */
        integerLinkedList.addLast(500);

        printList(integerLinkedList);

        /*
         * Gets the first element of the linked list.
         * Time complexity - O(1)
         */
        Integer firstElement = integerLinkedList.getFirst();
        System.out.println("\n\nThe first element is " + firstElement);

        /*
         * Gets the last element of the linked list.
         * Time complexity - O(1)
         */
        Integer lastElement = integerLinkedList.getLast();
        System.out.println("\n\nThe last element is " + lastElement);

        /*
         * Removes the first element from the linked list.
         * And shifts all the subsequent elements.
         * Time complexity - O(1)
         */
        integerLinkedList.removeFirst();

        printList(integerLinkedList);

        /*
         * Removes the last element from the linked list.
         * And shifts all the subsequent elements.
         * Time complexity - O(1)
         */
        integerLinkedList.removeLast();

        printList(integerLinkedList);

        /*
         * Clear operation removes all the elements from the linked list.
         * Time complexity - O(n)
         */
        integerLinkedList.clear();

        printList(integerLinkedList);
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
