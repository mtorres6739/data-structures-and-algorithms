package datastructures.tree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BinarySearchTreeTest {


  // Test to see if the tree can be instantiated
  @Test
  public void testForInstantiate() {
    BinarySearchTree testTree = new BinarySearchTree();
    assertNull (testTree.getRoot());
  }

  // Test to see if the method workds to add a single item to the tree
  @Test
  public void testForAdd1() {
    BinarySearchTree testTree = new BinarySearchTree();

    testTree.add(20);
    Integer expected = 20;

    assertEquals(expected, testTree.getRoot().value);
  }

  // Test to see if the root is correct and if multiple values can be added
  @Test
  public void testForAdd2() {
    BinarySearchTree testTree = new BinarySearchTree();

    testTree.add(20);
    testTree.add(30);
    testTree.add(40);
    Integer expected = 20;

    assertEquals(expected, testTree.getRoot().value);
  }


// Test to see if the left child is correct
  @Test
  public void testForAdd3() {
    BinarySearchTree testTree = new BinarySearchTree();

    testTree.add(60);
    testTree.add(40);
    testTree.add(50);
    testTree.add(30);
    Integer expected = 30;

    assertEquals(expected, testTree.getRoot().left.left.value);
  }

// Test to see if the contains method works
  @Test
  public void testForAdd4() {
    BinarySearchTree testTree = new BinarySearchTree();

    testTree.add(60);
    testTree.add(40);
    testTree.add(50);
    testTree.add(30);

    assertTrue(testTree.contains(50));
  }


  // Test to see if the method catches a value that shouldnt be there

  @Test
  public void testForAdd5() {
    BinarySearchTree testTree = new BinarySearchTree();

    testTree.add(60);
    testTree.add(40);
    testTree.add(50);
    testTree.add(30);

    assertFalse(testTree.contains(1));
  }

}
