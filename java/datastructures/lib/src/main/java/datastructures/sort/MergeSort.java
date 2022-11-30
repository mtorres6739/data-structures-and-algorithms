package datastructures.sort;

public class MergeSort {

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
}
