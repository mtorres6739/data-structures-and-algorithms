# Tree Intersection
<!-- Short summary or background information -->

A tree intersection is a function that takes in two binary trees and returns a set of values found in both trees.


## Challenge
<!-- Description of the challenge -->

Write a function called tree_intersection that takes two binary tree parameters.


## Approach & Efficiency
<!-- What approach did you take? Why? What is the Big O space/time for this approach? -->

The approach I took was to create a method that would take in two binary trees. I then created a method that would traverse the first tree and add the values to a set. I then created a method that would traverse the second tree and check if the values were in the set. If the value was in the set, I would add it to a new set. I then returned the new set.

The Big O for the tree_intersection method is O(n).

## API
<!-- Description of each method publicly available in each of your hashtable -->

- tree_intersection
  - Takes in two binary trees and returns a set of values found in both trees.

## Code

- [Tree Intersection](https://github.com/mtorres6739/data-structures-and-algorithms/blob/main/java/datastructures/lib/src/main/java/datastructures/hashtable/TreeIntersection.java)
- [Tree Intersection Tests](https://github.com/mtorres6739/data-structures-and-algorithms/blob/main/java/datastructures/lib/src/test/java/datastructures/hashtableTest/TreeIntersection.java)

```java

public class TreeIntersection {

  public static Set<Integer> treeIntersection(Node root1, Node root2) {
    HashSet<Integer> answer = new HashSet<>();
    HashMap<Integer, Boolean> valuesFromRoot1 = new HashMap<>();
    LinkedList<Node> nodesToProcess = new LinkedList<>();

    nodesToProcess.add(root1);
    while (!nodesToProcess.isEmpty()) {
      Node current = nodesToProcess.removeFirst();
      valuesFromRoot1.put((Integer) current.value, null);
      if (current.left != null) {
        nodesToProcess.add(current.left);
      }
      if (current.right != null) {
        nodesToProcess.add(current.right);
      }
    }
    nodesToProcess.add(root2);

    while (!nodesToProcess.isEmpty()) {
      Node current = nodesToProcess.removeFirst();
      if (valuesFromRoot1.containsKey(current.value)) {
        answer.add((Integer) current.value);
      }
      if (current.left != null) {
        nodesToProcess.add(current.left);
      }
      if (current.right != null) {
        nodesToProcess.add(current.right);
      }
    }
    return answer;
  }

}

```

### References

- [Hashtable](https://www.geeksforgeeks.org/implementing-our-own-hash-table-with-separate-chaining-in-java/)
- [Hashing](https://www.geeksforgeeks.org/hashing-set-2-separate-chaining/)
- [Intro to Hash Tables](https://codefellows.github.io/common_curriculum/data_structures_and_algorithms/Code_401/class-30/resources/Hashtables.html)
- [What is a hash table](https://www.youtube.com/watch?v=MfhjkfocRR0)
- [Basics of hash tables](https://www.hackerearth.com/practice/data-structures/hash-tables/basics-of-hash-tables/tutorial/)
- [Hash table wiki](https://en.wikipedia.org/wiki/Hash_table)
- [Github Sharina](https://github.com/SharinaS)
- [Github Ben](https://github.com/akkanben)
- [Github Roger](https://github.com/RogerMReyes)




