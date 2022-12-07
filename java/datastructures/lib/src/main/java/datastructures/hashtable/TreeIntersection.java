package datastructures.hashtable;



import datastructures.tree.Node;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

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
