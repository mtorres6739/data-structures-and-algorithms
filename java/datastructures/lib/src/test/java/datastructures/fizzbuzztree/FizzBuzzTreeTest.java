package datastructures.fizzbuzztree;

import datastructures.tree.Node;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class FizzBuzzTreeTest {

  @Test
  public void testForFizzBuzz() {
    Node root = new Node("1");
    root.left = new Node("2");

    root.left.left = new Node("6");
    root.left.right = new Node("7");

    root.right = new Node("3");

    FizzBuzzTree sut = new FizzBuzzTree(root);
    sut.fizzBuzzWrapper();
    assertEquals("Fizz", sut.root.right.value);
  }


  @Test
  public void testForFizzBuzz2() {
    Node root = new Node("1");
    root.left = new Node("2");

    root.left.left = new Node("6");
    root.left.right = new Node("7");

    root.right = new Node("3");

    FizzBuzzTree sut = new FizzBuzzTree(root);
    sut.fizzBuzzWrapper();
    assertEquals("7", sut.root.left.right.value);
  }


  @Test
  public void testForFizzBuzz3() {
    Node root = new Node("1");
    root.left = new Node("2");

    root.left.left = new Node("6");
    root.left.right = new Node("7");

    root.right = new Node("3");

    root.right.right = new Node("15");

    FizzBuzzTree sut = new FizzBuzzTree(root);
    sut.fizzBuzzWrapper();
    assertEquals("FizzBuzz", sut.root.right.right.value);
  }
}
