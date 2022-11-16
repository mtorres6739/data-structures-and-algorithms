package datastructures.tree;

import java.lang.reflect.Array;
import java.util.*;

public class BinaryTree<T> {
  // This is the instance variable
  public Node<T> root;

  // THis is the constructor
  public BinaryTree() {
    root = null;
  }

  public BinaryTree(Node<T> root) {
    this.root = root;
  }


  // PRE ORDER

  public ArrayList<T> preOrder() {
    ArrayList<T> valuesArray = new ArrayList<>();
    preOrderHelp(this.root, valuesArray);
    return valuesArray;
  }

  private ArrayList<T> preOrderHelp(Node<T> root, ArrayList<T> valuesArray) {
    if (root == null) {
      return valuesArray;
    }
    valuesArray.add((T) root.value);

    if (root.left != null) {
      valuesArray = preOrderHelp(root.left, valuesArray);
    }
    if (root.right != null) {
      valuesArray = preOrderHelp(root.right, valuesArray);
    }
    return valuesArray;
  }


  // IN ORDER

  public ArrayList<T> inOrder() {
    ArrayList<T> valuesArray = new ArrayList<>();
    preOrderHelp(this.root, valuesArray);
    return valuesArray;
  }

  private ArrayList<T> inOrderHelp(Node<T> root, ArrayList<T> valuesArray) {
    if (root == null) {
      return valuesArray;
    }
    if (root.left != null) {
      valuesArray = preOrderHelp(root.left, valuesArray);
    }
    valuesArray.add((T) root.value);

    if(root.right != null) {
      valuesArray = preOrderHelp(root.right, valuesArray);
    }
    return valuesArray;

  }

  // POST ORDER

  public ArrayList<T> postOrder() {
    ArrayList<T> valuesArray = new ArrayList<>();

    preOrderHelp(this.root, valuesArray);
    return valuesArray;
  }

  private ArrayList<T> postOrderHelp(Node<T> root, ArrayList<T> valuesArray) {
    if (root == null) {
      return valuesArray;
    }
    if (root.left != null) {
      valuesArray = preOrderHelp(root.left, valuesArray);
    }
    if (root.right != null) {
      valuesArray = preOrderHelp(root.right, valuesArray);
    }
    valuesArray.add((T) root.value);
    return valuesArray;
  }


  // MAX

  public int findMaxValue() {
    if (this.root.value instanceof Integer) {
      return preOrderMaxFind((Node<Integer>) this.root, Integer.MIN_VALUE);
    } else {
      throw new IllegalStateException();
    }

  }

  private int preOrderMaxFind(Node <Integer> current, int highest) {
      if (current == null) {
      return highest;
      }
      if (current.value > highest) {
        highest = current.value;
      }
      if (current.left != null) {
        highest = preOrderMaxFind(current.left, highest);
      }
      if (current.right != null) {
        highest = preOrderMaxFind(current.right, highest);
      }
      return highest;
    }


    // BREADTH FIRST

  public List<T> breadthFirstWrapper() {
    return breadthFirstTraverse(this.root);
  }

  public List<T> breadthFirstTraverse (Node<T> root) {
    Queue<Node<T>> storeQ = new LinkedList<>();
    List<T> result = new LinkedList<>();

    if (root == null) {
      throw new NoSuchElementException();
    } else {
      storeQ.add(root);
    }

    while (!storeQ.isEmpty()) {
      Node<T> currentNode = storeQ.remove();
      result.add(currentNode.value);

      System.out.println("current result: " + result);
      System.out.println("current queue: " + storeQ);
      System.out.println("current node: " + currentNode.value);

      if (currentNode != null && currentNode.left != null) {
        storeQ.add(currentNode.left);
      }

      if (currentNode != null && currentNode.right != null) {
        storeQ.add(currentNode.right);
      }
    }
    return result;
  }

  }


