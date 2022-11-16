package datastructures.tree;


import org.junit.Before;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class BinaryTreeTest {

  BinaryTree tree = new BinaryTree();

  @Before
  public void setup() throws Exception {
    Node node5 = new Node(5, new Node(6), null);
    Node node2 = new Node(2, new Node(4), node5);
    Node rootNode = new Node(1, node2, new Node(3));
    tree = new BinaryTree();
    tree.root = rootNode;
  }

  @Test
  public void testForPreOrder() {
    Node root = new Node(1);
    root.left = new Node(2);
    root.right = new Node(3);

    BinaryTree testTree = new BinaryTree(root);

    ArrayList<Integer> correct = new ArrayList<>();
    correct.add(1);
    correct.add(2);
    correct.add(3);

    assertArrayEquals(correct.toArray(), testTree.preOrder().toArray());
  }

  @Test
  public void testForInPreOrder() {

    Node root = new Node(1);
    root.left = new Node(2);
    root.right = new Node(3);

    BinaryTree testTree = new BinaryTree(root);

    ArrayList<Integer> correct = new ArrayList<>();
    correct.add(1);
    correct.add(2);
    correct.add(3);

    assertArrayEquals(correct.toArray(), testTree.preOrder().toArray());

  }

  @Test
  public void testForPostOrder() {

    Node root = new Node(1);
    root.left = new Node(2);
    root.right = new Node(3);

    BinaryTree testTree = new BinaryTree(root);

    ArrayList<Integer> correct = new ArrayList<>();
    correct.add(1);
    correct.add(2);
    correct.add(3);

    assertArrayEquals(correct.toArray(), testTree.postOrder().toArray());
  }


  @Test
  public void testForMaxValue() {
    Node root = new Node(2);
    root.left = new Node(7);
    root.right = new Node(5);

    root.left.left = new Node(2);
    root.left.right = new Node(6);

    root.left.right.left = new Node(5);
    root.left.right.right = new Node(12);

    root.right.right = new Node(9);

    root.right.right.left = new Node(4);

    BinaryTree testTree = new BinaryTree(root);

    assertEquals(12, testTree.findMaxValue());
  }


  @Test
  public void testForBreadthFirst() {
    Node root = new Node(2);
    root.left = new Node(7);
    root.right = new Node(5);

    root.left.left = new Node(2);
    root.left.right = new Node(6);

    root.left.right.left = new Node(5);
    root.left.right.right = new Node(11);

    root.right.right = new Node(9);

    root.right.right.left = new Node(4);

    BinaryTree testTree = new BinaryTree(root);
    ArrayList<Integer> correctAnswer = new ArrayList<>();
    correctAnswer.add(2);
    correctAnswer.add(7);
    correctAnswer.add(5);
    correctAnswer.add(2);
    correctAnswer.add(6);
    correctAnswer.add(9);
    correctAnswer.add(5);
    correctAnswer.add(11);
    correctAnswer.add(4);

    assertEquals(correctAnswer, testTree.breadthFirstWrapper());
  }


}
