package datastructures.stacksandqueues;

import org.junit.jupiter.api.Test;

import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.*;

public class QueueTest {

  // Can successfully enqueue into a queue
  @Test
  public void tesForEnqueue() {
    Queue queueTest = new Queue();
    queueTest.enqueue(10);
    assertEquals(10,queueTest.peek());
  }

  // Can successfully enqueue multiple values into a queue
  @Test
  public void testForMultipleEnqueue() {
    Queue queueTest = new Queue();
    queueTest.enqueue(10);
    queueTest.enqueue(20);
    assertEquals(10, queueTest.front.data);
    assertEquals(20, queueTest.back.data);
  }

  // Can successfully dequeue out of a queue the expected value
  @Test
  public void testForDeQueue() {
    Queue queueTest = new Queue();
    queueTest.enqueue(10);
    queueTest.enqueue(20);
    queueTest.enqueue(30);
    assertEquals(10, queueTest.dequeue());
    assertEquals(20, queueTest.front.data);
    assertEquals(30, queueTest.back.data);
  }
// Can successfully peek into a queue, seeing the expected value
  @Test
  public void testForPeekQueue() {
    Queue queueTest = new Queue();
    queueTest.enqueue(10);
    queueTest.enqueue(20);
    queueTest.enqueue(30);
    assertEquals(10, queueTest.peek());
  }
// Can successfully empty a queue after multiple dequeues
  @Test
  public void testForDeQueueEmpty() {
    Queue queueTest = new Queue();
    queueTest.enqueue(10);
    queueTest.enqueue(20);
    queueTest.enqueue(30);
    queueTest.dequeue();
    queueTest.dequeue();
    queueTest.dequeue();
    assertNull(queueTest.front);
    assertNull(queueTest.back);
  }

  // Can successfully instantiate an empty queue
  @Test
  public void testForInstantiateQueue() {
    Queue queueTest = new Queue();
    assertNull(queueTest.front);
    assertNull(queueTest.back);
    assertTrue(queueTest.isEmpty());
  }

  // Calling dequeue or peek on empty queue raises exception
  @Test
  public void testForEmptyException() {
    Queue queueTest = new Queue();
  assertThrows(NoSuchElementException.class, ()->queueTest.peek());
  assertThrows(NoSuchElementException.class, ()->queueTest.dequeue());
  }
}
