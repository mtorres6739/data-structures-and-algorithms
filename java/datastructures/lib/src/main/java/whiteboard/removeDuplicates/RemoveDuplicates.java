package whiteboard.removeDuplicates;

import java.util.HashSet;

public class RemoveDuplicates {
  public static LinkyList<Integer> removeDuplicates(LinkyList<Integer> list) {
    HashSet<Integer> set = new HashSet<Integer>();
    ListNode<Integer> prev = null;
    ListNode<Integer> curr = list.head;
    while (curr != null) {
      if (set.contains(curr.val)) {
        prev.next = curr.next;
      } else {
        set.add(curr.val);
        prev = curr;
      }
      curr = curr.next;
    }
    return list;
  }
}

/*
In this example, I use a HashSet instead of an array to keep track of the unique values that we've seen so far. I also use a prev and curr pointer to iterate through the LinkedList. I start at the head of the list, add the head's value to the set, and set prev to the head. I then move to the next node and check if its value is already in the set. If it is, I remove it by pointing prev.next to curr.next which skips over the current node and removes it from the list. If the value is not in the set, I add it to the set and set prev to curr. I continue iterating through the list until I reach the end of the list.
*/
