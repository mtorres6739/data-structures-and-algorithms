package whiteboard.removeDuplicates;

public class ListNode<T> {
  T val;
  ListNode<T> next;
  public ListNode(T val) {
    this.val = val;
    this.next = null;
  }
}

//  The ListNode class has a generic type T and holds a value val and a reference to the next node in the list next.
