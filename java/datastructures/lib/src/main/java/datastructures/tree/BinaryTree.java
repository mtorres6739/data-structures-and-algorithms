package datastructures.tree;

import java.lang.reflect.Array;
import java.util.ArrayList;

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


  }


