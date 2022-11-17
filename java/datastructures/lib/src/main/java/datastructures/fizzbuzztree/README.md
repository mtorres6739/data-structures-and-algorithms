# Fizz Buzz Tree Code Challenge

## Code Challenge 18 - Fizz Buzz Tree

Create a function called `fizzBuzzTree` which takes a tree as an argument. Without utilizing any of the built-in methods available to your language, determine weather or not the value of each node is divisible by 3, 5 or both. Create a new tree with the same structure as the original, but the values modified as follows:

- If the value is divisible by 3, replace the value with `Fizz`
- If the value is divisible by 5, replace the value with `Buzz`
- If the value is divisible by 3 and 5, replace the value with `FizzBuzz`
- If the value is not divisible by 3 or 5, simply turn the number into a String.

Return the new tree.


### Fizz Buzz Tree Methods Implemented

- `fizzBuzzTree()`

```java
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
```

### Attribution

- TA Raul Zarate DSA Class
- [K-ary Help: GeeksforGeeks](https://www.geeksforgeeks.org/k-ary-heap/#:~:text=K%2Dary%20heaps%20are%20a,in%20left%20to%20right%20manner.)
- [Construct Full K-ary Tree: geeksforgeeks](https://www.geeksforgeeks.org/construct-full-k-ary-tree-preorder-traversal/)
- [Construct the full k-ary tree: tutorialspoint](https://tutorialspoint.dev/data-structure/binary-tree-data-structure/construct-full-k-ary-tree-preorder-traversal)
- [Github Sharina](https://github.com/SharinaS)




