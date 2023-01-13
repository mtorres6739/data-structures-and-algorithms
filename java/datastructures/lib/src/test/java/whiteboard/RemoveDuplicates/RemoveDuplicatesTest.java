package whiteboard.RemoveDuplicates;

import org.junit.jupiter.api.Test;
import whiteboard.removeDuplicates.LinkyList;
import whiteboard.removeDuplicates.RemoveDuplicates;

import static org.junit.Assert.*;

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


//In this test, I created a LinkedList with some duplicate values and call the removeDuplicates() function on it. I then create an expected LinkedList without the duplicate values, and assert that the output of the function has the same size and element as the expected output.
