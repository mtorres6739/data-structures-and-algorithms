package datastructures.linkedlist2;

public class Node<T> {
  public T value;
  public Node<T> next = null;

  public Node(T value) {
    this.value = value;
  }

  public Node() {
    //empty
  }
}

//I can't take credit for everything in linkedlist2.  I had to use the solution from Ben because somewhere down the line I made some mistakes in my previous linkedlist.  His solution was used to help with graph.
