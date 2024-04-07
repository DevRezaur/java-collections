package main;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapClass {

    public static void main(String[] args) {
        LinkedHashMap<String, Object> linkedHashMap = new LinkedHashMap<>();

        /*
         * Put(key, value) operation adds elements to the linked hash map.
         * It maintains insertion order.
         * Time complexity - O(n)
         */
        linkedHashMap.put("Name", "Rezaur Rahman");
        linkedHashMap.put("Age", 26);
        linkedHashMap.put("Years of Experience", 5.5);

        printLinkedHashMap(linkedHashMap);

        /*
         * Get(key) operation gets a particular element's value via a key.
         * It returns null if key not found.
         * Time complexity - O(n)
         */
        Object value = linkedHashMap.get("Age");
        System.out.println("\n\nThe value of Age is " + value);

        /*
         * ContainsKey(key) operation checks if a particular key is present in the linked hash map or not.
         * It returns true if key found. Else returns false;
         * Time complexity - O(n)
         */
        boolean isPresent = linkedHashMap.containsKey("Age");
        System.out.println("\n\nThe key Age is present: " + isPresent);

        /*
         * Remove(key) operation removed a particular key if it is present in the linked hash map.
         * After successful removal, it returns the value of the key.
         * Time complexity - O(n)
         */
        Object removedValue = linkedHashMap.remove("Age");
        System.out.println("\n\nThe key Age is removed. And the value was: " + removedValue);

        /*
         * It returns the size of the linked hash map.
         * Return type is always integer.
         * Time complexity - O(1)
         */
        int size = linkedHashMap.size();
        System.out.println("\n\nThe size of the hash map is: " + size);

        /*
         * It checks if the hash map is empty of not.
         * Time complexity - O(1)
         */
        boolean isEmpty = linkedHashMap.isEmpty();
        System.out.println("\n\nThe hash map is empty: " + isEmpty);

        LinkedHashMap<String, Object> anotherLinkedHashMap = new LinkedHashMap<>();
        anotherLinkedHashMap.put("Tech Stack", "Java, Angular");
        anotherLinkedHashMap.put("Databases", "MySql, Postgres");

        /*
         * PutAll(Map<k, v>) operation adds an entire hash map to the existing linked hash map.
         * Time complexity - O(N^2)
         */
        linkedHashMap.putAll(anotherLinkedHashMap);
        printLinkedHashMap(linkedHashMap);

        /*
         * Clear() operation deletes all the elements from the linked hash map.
         * Time complexity - O(n)
         */
        linkedHashMap.clear();
        printLinkedHashMap(linkedHashMap);
    }

    /**
     * Helper method for printing the linked hash map.
     *
     * @param linkedHashMap The linked has map to be printed
     */
    private static void printLinkedHashMap(LinkedHashMap<String, Object> linkedHashMap) {
        System.out.println("\n\nPrinting the linked hash map");

        for (Map.Entry<String, Object> element : linkedHashMap.entrySet()) {
            System.out.println("Key: " + element.getKey() + " | Value: " + element.getValue());
        }
    }
}
