package datastructures.linkedlist;

public class Node
{
  public int value;
  public Node next;

  Node(int value, Node next)
  {
    this.value = value;
    this.next = null;
  }

  public Node() {

  }

  public String toString() {
    String outputString = "{" + this.value + "} -> ";
    if (this.next == null) {
      outputString += "NULL";
    }
    return outputString;

  }
}
