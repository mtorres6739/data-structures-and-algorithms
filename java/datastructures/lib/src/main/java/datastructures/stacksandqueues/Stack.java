package datastructures.stacksandqueues;

import java.util.EmptyStackException;
import java.util.NoSuchElementException;

public class Stack<T> {
  Node<T> top;

  public Stack() {
    this.top = null;
  }

  public void push(T data) {
    Node<T> newNode = new Node<T>(data);
    newNode.next = this.top;
    this.top = newNode;
  }

  public T pop() throws NoSuchElementException {
    if (this.top == null) {
      throw new NoSuchElementException("empty stack");
    } else {
      Node<T> temp = top;
      this.top = this.top.next;
      return temp.data;
    }
  }

  public T peek() throws EmptyStackException {
    if (this.top == null) {
      throw new EmptyStackException();
    } else {
      return this.top.data;
    }
  }

  public boolean isEmpty() {
    return this.top == null;
  }

}
