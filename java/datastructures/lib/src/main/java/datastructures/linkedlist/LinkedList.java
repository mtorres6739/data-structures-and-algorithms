package datastructures.linkedlist;

import java.util.StringJoiner;

public class LinkedList
{
  Node head;
  private int size;

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

  public void insertBefore (int value, int newNodeValue) {
    Node newNode = new Node();
    Node current = head;
    newNode.value = newNodeValue;

    if (head.value == value) {
      newNode.next = head;
      head = newNode;
    }
    while (current.next !=null && current.next.value != value) {
      current = current.next;
    }

    if (current.next != null) {
      Node lead = current.next;
      current.next = newNode;
      newNode.next = lead;
      return;
    }
  }

  public void insertAfter (int num1, int num2) {
    Node current = head;
    Node newNode = new Node();
    newNode.value = num2;

    while (current !=null & current.value != num1) {
      current = current.next;
    }

    if (current != null) {
      newNode.next = current.next;
      current.next = newNode;
    }
  }

  public void append(int num) {
    Node newNode = new Node();
    newNode.value = num;
    Node current;

    if (head == null) {
      head = newNode;
    } else {
      current = head;
      while (current.next != null) {
        current = current.next;
      }
      current.next = newNode;
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



  public int valueFromEnd(int k) {
    Node current = head;
    int listLength = 0;

    while (current != null) {
      listLength =+ 1;
      current = current.next;
    }
    int steps = listLength - k;
    if (steps < 0 || steps > listLength)
      throw new IllegalArgumentException("List is not big enough for k");

    current = head;
    int counter = 0;

    while (current != null && counter != steps) {
      counter =+ 1;
      current = current.next;
    }
    return current.value;
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
