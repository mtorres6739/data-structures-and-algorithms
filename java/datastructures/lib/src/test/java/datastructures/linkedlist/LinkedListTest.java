package datastructures.linkedlist;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class LinkedListTest
{

  @Test void testForInsert()
  {
    LinkedList sut = new LinkedList();
    sut.insert(8);
    assertEquals(8,sut.head.value);
  }

  @Test void testForIncludes()
  {
    LinkedList sut = new LinkedList();
    sut.includes(8);
//    assertTrue(sut.includes(8));
    assertFalse(sut.includes(8));
  }

  @Test void testForToString()
  {
    LinkedList sut = new LinkedList();
    sut.insert(8);
    sut.insert(10);
    sut.insert(12);
    System.out.println(sut);
    assertEquals("{12} -> {10} -> {8} -> NULL", sut.toString());
  }
  @Test void testAMethod()
    {
      LinkedList sut = new LinkedList();
      System.out.println(sut);
      assertTrue(true);
    }
}
