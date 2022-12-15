package datastructures.graph;


import org.junit.jupiter.api.Test;

import java.util.LinkedList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DepthFirstTest {

  @Test
  public void testForDepthFirstIterative() {
    Graph<String> testGraph = new Graph<>();

    //         Mat ---- Max
    //           \     /
    //           Austin ------- Ben
    //           /   \         /
    //         Ian -- Joe     /
    //          \____________/
    //

    Node<String> austin = testGraph.addNodeToSetOfGraphNodes("Austin");
    Node<String> mat = testGraph.addNodeToSetOfGraphNodes("Mat");
    Node<String> ben = testGraph.addNodeToSetOfGraphNodes("Ben");
    Node<String> max = testGraph.addNodeToSetOfGraphNodes("Max");
    Node<String> joe = testGraph.addNodeToSetOfGraphNodes("Joe");
    Node<String> ian = testGraph.addNodeToSetOfGraphNodes("Ian");

    testGraph.addEdge(austin, mat, 1);
    testGraph.addEdge(austin, ben, 1);
    testGraph.addEdge(austin, max, 1);
    testGraph.addEdge(austin, joe, 1);
    testGraph.addEdge(austin, ian, 1);
    testGraph.addEdge(mat, max, 1);
    testGraph.addEdge(ian, joe, 1);
    testGraph.addEdge(ian, ben, 1);

    LinkedList<String> actualAnswer = DepthFirst.depthFirstIterative(mat);

    List<String> expected = new LinkedList<>();
    expected.add("Mat");
    expected.add("Austin");
    expected.add("Ben");
    expected.add("Ian");
    expected.add("Joe");
    expected.add("Max");

    assertEquals(expected.subList(0, 1), actualAnswer.subList(0, 1));
  }
}
