# Remove Duplicates

## Problem Domain

Write a function to take in a LinkedList, and return that LinkedList with its duplicate values removed.

## Approach & Efficiency

The approach I took was to create a HashSet instead of an array to keep track of the unique values that I've seen so far. I also use a prev and curr pointer to iterate through the LinkedList. I start at the head of the list, add the head's value to the set, and set prev to the head. I then move to the next node and check if its value is already in the set. If it is, I remove it by pointing prev.next to curr.next which skips over the current node and removes it from the list. If the value is not in the set, I add it to the set and set prev to curr. I continue iterating through the list until I reach the end of the list.

The big O for this solution is:
Time: O(n)
Space: O(n)

## API

### removeDuplicates

#### Arguments

`LinkyList<Integer> list`

#### Returns

`LinkyList<Integer>`
The list with duplicate values removed from it.

## Code

```java
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

```

## Tests

```java
public class RemoveDuplicatesTest {
  @Test
  public void testRemoveDuplicates2() {
    LinkyList<Integer> list = new LinkyList<>();
    list.add(1);
    list.add(2);
    list.add(2);
    list.add(3);
    list.add(4);
    list.add(2);
    LinkyList<Integer> expected = new LinkyList<>();
    expected.add(1);
    expected.add(2);
    expected.add(3);
    expected.add(4);
    LinkyList<Integer> result = RemoveDuplicates.removeDuplicates(list);
    assertEquals(expected.size(), result.size());
    for(int i=0; i<result.size(); i++){
      assertEquals(expected.get(i), result.get(i));
    }
  }
}

  ```

## Whiteboard

![Whiteboard](/java/datastructures/lib/src/main/java/assets/img/WhiteboardExamRemoveDuplicates.png)

## Solution

[Link to Code](https://github.com/mtorres6739/data-structures-and-algorithms/blob/whiteboardExamCode-removeDuplicates/java/datastructures/lib/src/main/java/whiteboard/removeDuplicates/RemoveDuplicates.java)

[Link to Tests](https://github.com/mtorres6739/data-structures-and-algorithms/blob/whiteboardExamCode-removeDuplicates/java/datastructures/lib/src/test/java/whiteboard/RemoveDuplicates/RemoveDuplicatesTest.java)
