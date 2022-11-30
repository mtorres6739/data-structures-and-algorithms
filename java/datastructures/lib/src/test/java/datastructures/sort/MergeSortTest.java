package datastructures.sort;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class MergeSortTest {

  @Test
  public void testForMergeSort() {
    int[] actual = {5, 6, 1, 4, 3, 2};
    int[] expected = {1, 2, 3, 4, 5, 6};
    MergeSort.mergeSort(actual, actual.length);
    assertArrayEquals(expected, actual);
  }

  @Test
  public void testForMergeSortDescend() {
    int[] actual = {10, 9, 8, 7, 6, 5};
    int[] expected = {5, 6, 7, 8, 9, 10};
    MergeSort.mergeSort(actual, actual.length);
    assertArrayEquals(expected, actual);
  }

  @Test
  public void testForMergeSortOneValue() {
    int[] actual = {10};
    int[] expected = {10};
    MergeSort.mergeSort(actual, actual.length);
    assertArrayEquals(expected, actual);
  }

  @Test
  public void testForMergeSortNegativeNumber() {
    int[] actual = {10, 9, -8, 7, 6, 5};
    int[] expected = {-8, 5, 6, 7, 9, 10};
    MergeSort.mergeSort(actual, actual.length);
    assertArrayEquals(expected, actual);
  }
}
