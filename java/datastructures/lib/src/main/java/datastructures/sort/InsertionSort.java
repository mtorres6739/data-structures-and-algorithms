package datastructures.sort;

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
}

//Reference: https://www.baeldung.com/java-insertion-sort
