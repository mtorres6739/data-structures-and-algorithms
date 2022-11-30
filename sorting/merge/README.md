# Blog Notes: Merge Sort

## Merge Sort

Merge sort is a divide and conquer algorithm that was invented by John von Neumann in 1945. It is one of the most efficient sorting algorithms and is a key component of many other algorithms (such as quicksort). Merge sort works by splitting the array into two halves, sorting each half, and then merging the two sorted halves.

## Efficiency

It has a time complexity of O(n log n) and a space complexity of O(n).

## Algorithm

1. Divide the unsorted list into n sublists, each containing 1 element (a list of 1 element is considered sorted).
2. Repeatedly merge sublists to produce new sorted sublists until there is only 1 sublist remaining. This will be the sorted list.

## Example

![Merge Sort](https://upload.wikimedia.org/wikipedia/commons/c/cc/Merge-sort-example-300px.gif)

Ref: <https://upload.wikimedia.org/wikipedia/commons/c/cc/Merge-sort-example-300px.gif>

## Pseudocode

```
  MergeSort(int[] arr, int l, int r)
    IF l < r
      // Find the middle point to divide the array into two halves
      int m = l + (r - l) / 2

      // Sort first and second halves
      MergeSort(arr, l, m)
      MergeSort(arr, m + 1, r)

      // Merge the sorted halves
      Merge(arr, l, m, r)
```

### Time Complexity

Merge sort has a worst-case and average complexity of O(n log n). The space complexity is O(n).

### Code

```java

 public static void mergeSort(int[] arr, int length) {
    if (length < 2) {
      return;
    }
    int mid = length / 2;
    int[] leftArr = new int[mid];
    int[] rightArr = new int[length - mid];

    for (int i = 0; i < mid; i++) {
      leftArr[i] = arr[i];
    }
    for (int i = mid; i < length; i++) {
      rightArr[i - mid] = arr[i];
    }
    mergeSort(leftArr, mid);
    mergeSort(rightArr, length - mid);

    merge(arr, leftArr, rightArr, mid, length - mid);
  }


  public static void merge(int[] arr, int[] leftArr, int[] rightArr, int left, int right) {
    int i = 0, j = 0;
    while (i < left && j < right) {
      if (leftArr[i] <= rightArr[j]) {
        arr[i + j] = leftArr[i];
        i++;
      } else {
        arr[i + j] = rightArr[j];
        j++;
      }
    }
    while (i < left) {
      arr[i + j] = leftArr[i];
      i++;
    }
    while (j < right) {
      arr[i + j] = rightArr[j];
      j++;
    }
  }

```

### References

* [Wikipedia](https://en.wikipedia.org/wiki/Merge_sort)
* [GeeksforGeeks](https://www.geeksforgeeks.org/merge-sort/)
* [Youtube: Michael Sambol](https://www.youtube.com/watch?v=4VqmGXwpLqc)
* [YouTube](https://www.youtube.com/watch?v=KF2j-9iSf4Q)
* [Wikipedia Merge Sort Graphic](https://upload.wikimedia.org/wikipedia/commons/c/cc/Merge-sort-example-300px.gif)
* [Sharini Github](https://github.com/SharinaS)
