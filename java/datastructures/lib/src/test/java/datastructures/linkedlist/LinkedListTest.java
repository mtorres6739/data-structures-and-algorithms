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

  @Test void testForInsertBefore()
  {
    LinkedList sut = new LinkedList();
    sut.insert(10);
    sut.insert(12);
    sut.insert(14);
    sut.insertBefore(12,99);
    assertEquals(99, sut.head.next.value);
  }

  @Test void testForInsertAfter()
  {
    LinkedList sut = new LinkedList();
    sut.insert(10);
    sut.insert(12);
    sut.insert(14);
    sut.insertAfter(12,99);
    assertEquals(99, sut.head.next.next.value);

  }

  @Test void testForAppend()
  {
    LinkedList sut = new LinkedList();
    sut.append(10);
    sut.append(99);
    assertEquals(10, sut.head.value);

  }

  @Test void testForIncludes()
  {
    LinkedList sut = new LinkedList();
    sut.includes(8);
//    assertTrue(sut.includes(8));
    assertFalse(sut.includes(8));
  }


  @Test void testForValueFromEnd() {
    LinkedList sut = new LinkedList();
    sut.insert(10);
    sut.insert(20);
    sut.insert(30);
    sut.insert(40);
    sut.insert(50);
    assertEquals(30, sut.valueFromEnd(3));
  }



  // Made with Ben Lieberman, Joe Rutkin and Mathew Torres for pair programming
  @Test void testForLinkedListZip(){
    LinkedList sut = new LinkedList();
    sut.insert(10);
    sut.insert(20);
    sut.insert(30);
    sut.insert(40);
    sut.insert(50);

    LinkedList sut1 = new LinkedList();
    sut1.insert(10);
    sut1.insert(20);
    sut1.insert(30);
    sut1.insert(40);
    sut1.insert(50);

    assertEquals("{50} -> {50} -> {40} -> {40} -> {30} -> {30} -> {20} -> {20} -> {10} -> {10} -> NULL", LinkedList.linkedListZip(sut, sut1).toString());

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
