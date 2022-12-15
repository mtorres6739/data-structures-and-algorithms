package datastructures.graph;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class DepthFirst<T> {

  public static <T> LinkedList<T> depthFirstIterative(Node<T> startingNode) {
    LinkedList<Node<T>> stackOfNodesToProcess = new LinkedList<>();
    HashSet<Node<T>> seen = new HashSet<>();
    LinkedList<T> answerList = new LinkedList<>();
    Graph<T> graph = new Graph<>();

    stackOfNodesToProcess.push(startingNode);

    while (!stackOfNodesToProcess.isEmpty()) {
      Node<T> currentNode = stackOfNodesToProcess.pop();

      if (!seen.contains(currentNode)) {
        seen.add(currentNode);
        answerList.add(currentNode.getValue());
      }

      HashSet<Node<T>> setOfNeighborNodes = graph.getNeighborNodes(currentNode);

      for (Node<T> neighbor : setOfNeighborNodes) {
        if (!seen.contains(neighbor)) {
          stackOfNodesToProcess.push(neighbor);
        }
      }
    }
    return answerList;
  }

}
