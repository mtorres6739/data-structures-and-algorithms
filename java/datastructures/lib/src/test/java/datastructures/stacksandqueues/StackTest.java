package datastructures.stacksandqueues;

import org.junit.jupiter.api.Test;

import java.util.EmptyStackException;

import static org.junit.jupiter.api.Assertions.*;

public class StackTest {

  // Can successfully push onto a stack
  @Test
  public void tesForPushToStack() {
    Stack stackTest = new Stack();
    stackTest.push(10);
    assertEquals(10,stackTest.top.data);
  }

  // Can successfully push multiple values onto a stack
  @Test
  public void tesForPushToMultiStack() {
    Stack stackTest = new Stack();
    stackTest.push(10);
    stackTest.push(20);
    assertEquals(20,stackTest.top.data);
  }

  // Can successfully pop off the stack
  @Test
  public void tesForPopFromStack() {
    Stack stackTest = new Stack();
    stackTest.push(10);
    stackTest.push(20);
    assertEquals(20,stackTest.pop());
    assertEquals(10, stackTest.top.data);
  }

// Can successfully empty a stack after multiple pops
  @Test
  public void tesForPopEmpty() {
    Stack stackTest = new Stack();
    stackTest.push(10);
    stackTest.push(20);
    stackTest.pop();
    stackTest.pop();
    assertTrue(stackTest.isEmpty());
  }

// Can successfully peek the next item on the stack
  @Test
  public void tesForPeekTop() {
    Stack stackTest = new Stack();
    stackTest.push(10);
    stackTest.push(20);
    assertEquals(20, stackTest.peek());
  }

// Can successfully instantiate an empty stack
  @Test
  public void tesForInstantiateEmptyStack() {
    Stack stackTest = new Stack();
    assertEquals(null, stackTest.top);
    assertTrue(stackTest.isEmpty());
  }


  @Test
  public void tesForEmptyException() {
    Stack stackTest = new Stack();
    assertThrows(EmptyStackException.class, ()-> stackTest.pop());
    assertThrows(EmptyStackException.class, ()->stackTest.peek());
  }
}
