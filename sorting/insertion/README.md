# Blog Notes: Insertion Sort

## Insertion Sort

Insertion sort is a simple sorting algorithm that builds the final sorted array (or list) one item at a time. It is much less efficient on large lists than more advanced algorithms such as quicksort, heapsort, or merge sort. However, insertion sort is efficient for small data sets, much like other quadratic sorting algorithms.

## Efficiency

It has a time complexity of O(n^2) and a space complexity of O(1).
It has a space complexity of O(1) because it is an in-place algorithm.

### Algorithm

1. Insertion sort iterates, consuming one input element each repetition, and growing a sorted output list.
2. At each iteration, insertion sort removes one element from the input data, finds the location it belongs within the sorted list, and inserts it there.
3. It repeats until no input elements remain.

### Example

![Insertion Sort](https://upload.wikimedia.org/wikipedia/commons/0/0f/Insertion-sort-example-300px.gif)

Ref: https://upload.wikimedia.org/wikipedia/commons/0/0f/Insertion-sort-example-300px.gif

### Pseudocode

```
 InsertionSort(int[] arr)

    FOR i = 1 to arr.length

      int j <-- i - 1
      int temp <-- arr[i]

      WHILE j >= 0 AND temp < arr[j]
        arr[j + 1] <-- arr[j]
        j <-- j - 1

      arr[j + 1] <-- temp
```

### Code
```
public class InsertionSort {

  public static void insertionSort(int[] arr) {
    for (int i = 1; i < arr.length; i++) {
      int key = arr[i];
      int follower = i-1;

      while (follower >= 0 && arr[follower] > key) {
        arr[follower + 1] = arr[follower];
        follower = follower-1;
      }
      arr[follower + 1] = key;
    }
  }
  ```

### Attribution

- [Wikipedia](https://en.wikipedia.org/wiki/Insertion_sort)
- [GeeksforGeeks](https://www.geeksforgeeks.org/insertion-sort/)
- [Tutorialspoint](https://www.tutorialspoint.com/data_structures_algorithms/insertion_sort_algorithm.htm)
- [Youtube - Geeks for Geeks](https://www.youtube.com/watch?v=OGzPmgsI-pQ)
- [Youtube - Michael Sambol](https://youtu.be/JU767SDMDvA)
- [Baeldung](https://www.baeldung.com/java-insertion-sort)
- [Sharini Github](https://github.com/SharinaS)
