package datastructures.stacksandqueues;

import java.util.EmptyStackException;
import java.util.NoSuchElementException;

public class PseudoQueue<T> {
  Stack<T> stack1 = new Stack<>();
  Stack<T> stack2 = new Stack<>();

  public void enqueue(T value) {
    stack1.push(value);
  }

  public T dequeue() {
    if (!stack2.isEmpty()) {
      while (!stack1.isEmpty()) {
        stack2.push(stack1.pop());
      }
      if (stack2.isEmpty()) {
        throw new NoSuchElementException();
      }
    }
    return stack2.pop();
  }

public  T peek() throws EmptyStackException {
    if (stack1.top == null) {
      throw new EmptyStackException();
    } else {
      return stack1.top.data;
    }
}


}
