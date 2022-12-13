package datastructures.graph;

import org.junit.jupiter.api.Test;

import java.util.HashSet;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class GraphTest {

  @Test
  public void testForAddNode() {
    Graph<Integer> testForGraph = new Graph<>();
    Integer integerTest = 24;
    Node<Integer> testNode = testForGraph.addNodeToSetOfGraphNodes(integerTest);
    assertTrue(testForGraph.nodesInGraph.contains(testNode), "Should be true");
  }

  @Test
  public void testForGetNode() {
    Graph<Integer> testForGraph = new Graph<>();
    Node<Integer> testNode = testForGraph.addNodeToSetOfGraphNodes(24);
    HashSet<Node<Integer>> testSet = testForGraph.getNodes();
    assertEquals(true, testSet.contains(testNode));
  }

  @Test
  public void testForGetNeighbors() {
    Graph<Integer> testForGraph = new Graph<>();
    Node<Integer> testNode1 = testForGraph.addNodeToSetOfGraphNodes(24);
    Node<Integer> testNode2 = testForGraph.addNodeToSetOfGraphNodes(8);

    testForGraph.addEdge(testNode1, testNode2, 400);

    HashSet<Node<Integer>> testList = testForGraph.getNeighborNodes(testNode1);
    assertEquals(true, testList.contains(testNode2));
  }

  @Test
  public void testForGetSize() {
    Graph<Integer> testForGraph = new Graph<>();

    testForGraph.addNodeToSetOfGraphNodes(24);
    testForGraph.addNodeToSetOfGraphNodes(8);
    testForGraph.addNodeToSetOfGraphNodes(-10);

    assertEquals(3, testForGraph.graphSize());
  }



  // Breadth First Test

  @Test
  public void testForBreadthFirstTraverse1() {
    Graph<Integer> testForGraph = new Graph<>();

    Node<Integer> testNode1 = testForGraph.addNodeToSetOfGraphNodes(24);
    Node<Integer> testNode2 = testForGraph.addNodeToSetOfGraphNodes(8);
    Node<Integer> testNode3 = testForGraph.addNodeToSetOfGraphNodes(98);

    testForGraph.addEdge(testNode1, testNode2, 200);
    testForGraph.addEdge(testNode3, testNode1, 300);

    HashSet<Integer> testAnswer = testForGraph.breadthFirstTraverse(testNode1);

    assertEquals(3, testAnswer.size());
  }

  @Test
  public void testForBreadthFirstTraverse2() {
    Graph<Integer> testForGraph = new Graph<>();

    Node<Integer> testNode1 = testForGraph.addNodeToSetOfGraphNodes(24);
    Node<Integer> testNode2 = testForGraph.addNodeToSetOfGraphNodes(8);

    testForGraph.addEdge(testNode1, testNode2, 200);

    HashSet<Integer> testAnswer = testForGraph.breadthFirstTraverse(testNode1);

    assertEquals(true, testAnswer.contains(24));
  }


  @Test
  public void testForBreadthFirstTraverse3() {
    Graph<Integer> testForGraph = new Graph<>();

    Node<Integer> testNode1 = testForGraph.addNodeToSetOfGraphNodes(24);
    Node<Integer> testNode2 = testForGraph.addNodeToSetOfGraphNodes(8);
    Node<Integer> testNode3 = testForGraph.addNodeToSetOfGraphNodes(48);

    testForGraph.addEdge(testNode1, testNode2, 200);
    testForGraph.addEdge(testNode3, testNode1, 300);
    testForGraph.addEdge(testNode3, testNode1, 300);

    HashSet<Integer> expected = new HashSet<>();
    expected.add(24);
    expected.add(8);
    expected.add(48);

    HashSet<Integer> testAnswer = testForGraph.breadthFirstTraverse(testNode1);

    assertEquals(expected, testAnswer);
  }



}
