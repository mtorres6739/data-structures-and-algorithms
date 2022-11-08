package datastructures.stacksandqueues;

import org.junit.jupiter.api.Test;

import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PseudoQueueTest {

  @Test
  public void testForEnqueue() {
    PseudoQueue sut = new PseudoQueue();
    sut.enqueue(10);
    assertEquals(10, sut.peek());
  }


  @Test
  public void testForEnqueueMulti() {
    PseudoQueue sut = new PseudoQueue();
    sut.enqueue(10);
    sut.enqueue(20);
    sut.enqueue(30);
    assertEquals(30, sut.peek());
  }

  @Test
  public void testForDequeue() {
    PseudoQueue sut = new PseudoQueue();
    sut.enqueue(10);
    sut.enqueue(20);
    sut.enqueue(30);
    assertEquals(10, sut.dequeue());
  }


}
