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


}
