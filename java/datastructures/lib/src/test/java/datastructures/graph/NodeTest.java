package datastructures.graph;

import org.junit.jupiter.api.Test;

public class NodeTest {

  @Test
  public void testForAddEdgeToListOfEdges() {
    Graph<Integer> testForGraph = new Graph<>();
    Node<Integer> testNode1 = testForGraph.addNodeToSetOfGraphNodes(24);
    Node<Integer> testNode2 = testForGraph.addNodeToSetOfGraphNodes(8);
  }
}
