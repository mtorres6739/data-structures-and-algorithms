package datastructures.fizzbuzztree;


import datastructures.tree.BinaryTree;
import datastructures.tree.Node;

public class FizzBuzzTree {

  Node<String> root;

  // Check for FizzBuzz
  public FizzBuzzTree(Node <String> root) {
    this.root = root;
  }

  public void fizzBuzzWrapper() {
    fizzBuzzCall(root);
  }

  // Traverse Tree
  private void fizzBuzzCall(Node<String> current) {
    if (current != null) {
      fizzBuzzCall(current.left);
      current.value = getFizzBuzz(current.value);
      fizzBuzzCall(current.right);
    }
  }

  // Get variations of Fizz Buzz
  private String getFizzBuzz(String input) {
    int value = Integer.parseInt(input);

    if (value % 3 == 0 && value % 5 == 0) {
      return "FizzBuzz";
    } else if (value % 3 == 0) {
      return "Fizz";
    } else if (value % 5 == 0) {
      return "Buzz";
    } else {
      return input;
    }
  }


  //New Tree and replace values

  public static BinaryTree<String> fizzBuzz(BinaryTree<Integer> input) {
    BinaryTree<String> correct = new BinaryTree<>();
    correct.root = fizzBuzzWalk(input.root);
    return correct;
  }


  private static Node<String> fizzBuzzWalk(Node<Integer> node) {
    if (node == null) {
      return null;
    } else {
      Node<String> correct = new Node<>();
      if (node.value % 15 == 0) {
        correct.value = "fizzbuzz";
      } else if (node.value % 5 == 0) {
        correct.value = "buzz";
      } else if (node.value % 3 == 0) {
        correct.value = "fizz";
      } else {
        correct.value = node.value.toString();
      }

      //Recurse on the left
      //Recurse on the right

      correct.left = fizzBuzzWalk(node.left);
      correct.right = fizzBuzzWalk(node.right);
      return correct;
    }

  }

}
