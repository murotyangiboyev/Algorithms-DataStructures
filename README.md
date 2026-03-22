# Algorithms & Data Structures

This repository is for storing algorithms that I've learnt. I write algorithms for solving leetcode problems.










### 1. Merge Sort
A stable, divide-and-conquer sorting algorithm that works by recursively splitting arrays.

| Case | Time Complexity | Space Complexity |
| :--- | :--- | :--- |
| **Average/Worst** | $O(n \log n)$ | $O(n)$ |

**How it works:**
* **Divide:** Split the unsorted list into $n$ sub-lists.
* **Conquer:** Recursively sort the sub-lists.
* **Combine:** Merge the sorted sub-lists to produce the final sorted list.
---









### 2. Quick Sort
An efficient, in-place sorting algorithm that uses a "pivot" element.

| Case | Time Complexity | Space Complexity |
| :--- | :--- | :--- |
| **Average** | $O(n \log n)$ | $O(\log n)$ |
| **Worst** | $O(n^2)$ | $O(n)$ |

**How it works:**
* **Pivot:** Pick an element from the array.
* **Partition:** Reorder the array so elements less than the pivot are on the left.
* **Recursion:** Apply the same steps to the left and right sub-arrays.
