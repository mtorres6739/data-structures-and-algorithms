package datastructures.hashtableTest;

import datastructures.hashtable.Entry;
import datastructures.hashtable.Hashtable;
import org.junit.Before;
import org.junit.jupiter.api.Test;


import static org.junit.Assert.*;


public class HashtableTest {
  Hashtable testHashtable;

  @Before
  public void testForSetUp() {
    testHashtable = new Hashtable();
    testHashtable.add("key1", "value1");
    testHashtable.add("bananas", "kiwis");
  }

  // Tests add method enters key and value
  @Test
  public void testForAdd() {
    assertTrue("Expected true",
      testHashtable.add("key3", "value 3")
    );
  }

  // Tests collision produces false from add method
  @Test
  public void testForAdd2() {
    assertFalse("Expected false",
      testHashtable.add("bananas", "kiwi")
    );
  }

  // Test shows when you input a key
  @Test
  public void testForGet() {
    assertEquals("first key should have value of value1",
      "value1",
      testHashtable.get("key1")
    );
  }

  // Check contains method for existing key
  @Test
  public void testForContains() {
    Entry testEntry = new Entry("hello", "there");
    String testStringKey = "hello";
    assertTrue("Expected true",
      testEntry.key.contains(testStringKey));
  }

  // Check contains method and returns false when key does not exist
  @Test
  public void testForContains2() {
    Entry testEntry = new Entry("apples", "granny smith");
    String testStringKey = "hello";
    assertFalse("Expected false",
      testEntry.key.contains(testStringKey));
  }

  // Check hash converts a string to a usable hash
  @Test
  public void testForHash() {
    Hashtable testHashtable = new Hashtable();
    String toHash = "Elephant";
    assertEquals("Expected index of 83",
      83,
      testHashtable.hash(toHash)
    );
  }

  @Test
  public void testForHash2() {
    Hashtable testHashtable = new Hashtable();
    String toHash = "cat";
    assertEquals("Expected index of 88",
      88,
      testHashtable.hash(toHash)
    );
  }

  @Test
  public void testForHash3() {
    Hashtable testHashtable = new Hashtable();
    String toHash = "abracadabra";
    assertEquals("Expected index of 92",
      92,
      testHashtable.hash(toHash)
    );
  }
}
