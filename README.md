# Collections in Java

The **Collection** in Java is a framework that provides an architecture to store and manipulate the group of objects.

Java Collections can achieve all the operations that you perform on a data such as **searching, sorting, insertion,
manipulation, and deletion**.

Java Collection means a **single unit of objects**. Java Collection framework provides many interfaces such as **Set,
List, Queue, Deque** and classes such as **ArrayList, Vector, LinkedList, PriorityQueue, HashSet, LinkedHashSet,
TreeSet**.

# Java Collection Hierarchy

![java-collection-hierarchy](./src/main/resources/image/java-collection-hierarchy.png)

# ArrayList

ArrayList is a class that implements **List** interface. The ArrayList class has a **regular array** inside it. When
an element is added, it is placed into the array. If the array is not big enough, a new, larger array is created to
replace the old one and the old one is removed.

* Implements List interface
* Maintains insertion order
* Internal data structure is regular array
* Dynamic size
* Allows duplicates and any number of null values
* Can not use primitive data type (int, float, double, string)
* Best for storing and accessing data

# LinkedList

LinkedList is a class that implements **List** and **Deque** interface. The functionality and behaviour of LinkedList
class is similar to **ArrayList**. main difference is in their internal implementation. ArrayList uses regular array
and LinkedList uses actual linked list as the internal implementation.

* Implements List and Deque interface
* Maintains insertion order
* Internal data structure is doubly linked list
* Dynamic size
* Allows duplicates and any number of null values
* Can not use primitive data type (int, float, double, string)
* Best for manipulating data

# HashSet

HashSet is a class that implements **Set** interface. The functionality and behaviour of HasSet is similar to set. That
means it doesn't allow any duplicates. And only one null value is accepted.

* Implements Set interface
* Doesn't maintain insertion order
* Internal data structure is hash table
* Dynamic size
* Doesn't allow duplicates and only one null value is acceptable
* Can not use primitive data type (int, float, double, string)
* Best for storing unique data