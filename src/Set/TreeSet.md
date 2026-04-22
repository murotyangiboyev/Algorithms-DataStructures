
# Sorted / Tree Set

### Definition

* TreeSet stores object strictly sorted. It does not use arrays like HashSet or LinkedHashSet.


* TreeSet internally uses a data structure called Self-Balancing Binary Search Tree.


* TreeSet is slower compared to HashSet

* The entire structure of TreeSet is just nodes floating in memory, connected by points.



### TreeSet Node contains
* Value / Left Pointer / Right Pointer / Parent Pointer / Color



### How It Works: The Insertion Process
* TreeSet does not use buckets or arrays like HashSet for inserting elements.
  TreeSet inserts data by playing a game of "Lower or Higher". It stores elements 
  based on Binary Tree Structure.     
**For Example:** it stores the first element to the root of the tree, then when storing
 second element, it compares the second element with the root element(first element).
 If second element is lower than the root element, it goes to the left point of the root element.
 If second element is higher than the root element, it goes to the right point of the root element.
 Other values are also stored like that.



### Time Complexity

* HashSet operations take $O(1)$ time (instant).
* TreeSet operations take $O(\log n)$ time