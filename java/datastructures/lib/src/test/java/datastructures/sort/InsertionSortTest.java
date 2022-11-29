package datastructures.sort;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.*;

public class InsertionSortTest {

  @Test
  public void testForInsertionSort() {
    int[] arr = {6, 2, 3, 4, 5, 1};
    InsertionSort.insertionSort(arr);
    int[] expected = {1, 2, 3, 4, 5, 6};

    assertArrayEquals("The arrays are not equal",expected, arr);
  }

  @Test
  public void testForInsertionSort2() {
    int[] arr = {5};
    InsertionSort.insertionSort(arr);
    int[] expected = {5};
    assertArrayEquals("The arrays are not equal", expected, arr);
  }

  @Test
  public void testForInsertionSort3() {
    int[] arr = {8, 4, 23, 42, 16, 15};
    InsertionSort.insertionSort(arr);
    int[] expected = {4, 8, 15, 16, 23, 42};

    assertArrayEquals("The arrays are not equal",expected, arr);
  }


}
