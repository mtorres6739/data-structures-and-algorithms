package datastructures.stacksandqueues;

import java.util.NoSuchElementException;

public class Queue<T> {
  Node<T> front;
  Node<T> back;

  public Queue() {
    this.front = null;
    this.back = null;
  }

  public void enqueue(T data) {
    Node<T> newNode = new Node<T>(data);
    if (this.back == null) {
      this.front = newNode;
      this.back = newNode;
    } else {
      this.back.next = newNode;
      this.back = newNode;
    }
  }

  public T dequeue() throws NoSuchElementException {
    Node<T> current = this.front;
    if (this.back == null) {
      throw new NoSuchElementException("queue is empty");
    }
    this.front = front.next;
    if (this.front == null) {
      this.back = null;
    }
    return current.data;
  }

  public T peek() throws NoSuchElementException {
    if (this.front == null) {
      throw new NoSuchElementException("queue is empty");
    } else {
      return this.front.data;
    }
  }

  public boolean isEmpty() {
    return this.front == null;
  }
}
