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
