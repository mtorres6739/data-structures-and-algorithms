package whiteboard.removeDuplicates;

public class LinkyList<T> {
  ListNode<T> head;
  public LinkyList() {
    this.head = null;
  }

  public void add(T val) {
    ListNode<T> newNode = new ListNode<T>(val);
    newNode.next = head;
    head = newNode;
  }

  public int size() {
    return 0;
  }

  public long get(T i) {
    return 0;
  }
}

//
// This is a custom implementation of linked list, LinkyList, where I have a class called ListNode which has a next and val fields.
// The LinkyList class also has a reference to the head of the list and an add method, which creates a new node with the given value and adds it to the head of the list. It also has a size and get method.
