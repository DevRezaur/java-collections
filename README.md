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
* Internal data structure is regular array
* Dynamic size
* Allows duplicate and null value
* Can not use primitive data type (int, float, double, string)