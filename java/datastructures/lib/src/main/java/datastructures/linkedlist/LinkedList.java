package datastructures.linkedlist;

import java.util.StringJoiner;

public class LinkedList
{
  Node head;

  public void insert(int value)
  {
    Node node = new Node();
    node.value = value;

    if (head == null) {
      head = node;
    } else {
      node.next = head;
      head = node;
    }
  }
  public boolean includes(int value)
  {
    Node current = head;
    while (current != null) {
      if (current.value == value) {
        return true;
      } else {
        current = current.next;
      }
    }
    return false;
  }

  @Override
  public String toString()
  {
    Node current = head;
    String outputString = "";
    while (current != null) {
      outputString += current;
      current = current.next;
    }
      return outputString;
  }
}
