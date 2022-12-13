package datastructures.graph;

import java.util.*;

public class Graph<T> {
  // Instance Variable
  HashSet<Node<T>> nodesInGraph;

  // Constructor
  public Graph() {
    this.nodesInGraph = new HashSet<>() {
    };
  }

  // Adds a new node to the graph
  public Node<T> addNodeToSetOfGraphNodes(T value) {
    Node<T> newNode = new Node<>(value);
    this.nodesInGraph.add(newNode);
    return newNode;
  }

  // Adds new edge nodes in graph
  public void addEdge(Node<T> node1, Node<T> node2, int weight) {
    if (this.nodesInGraph.contains(node1) && this.nodesInGraph.contains(node2)) {
      node1.addEdgeToListOfEdges(node2, weight);
      node2.addEdgeToListOfEdges(node1, weight);
    }
  }

  // Returns nodes in graph as collection
  public HashSet<Node<T>> getNodes() {
    return nodesInGraph;
  }

  // Returns collection of nodes connected to the given node
  public HashSet<Node<T>> getNeighborNodes(Node<T> node) {
    HashSet<Node<T>> setOfNeighborNodes = new HashSet<>();
    for (Edge<T> neighborNode : node.getListNeighborsWeightAndNode()) {
      if (!setOfNeighborNodes.contains(neighborNode.getTheNodeTheEdgeIsPointingTo())) {
        setOfNeighborNodes.add(neighborNode.getTheNodeTheEdgeIsPointingTo());
      }
    }
    return setOfNeighborNodes;
  }

  // Returns total number of nodes in graph
  public int graphSize() {
    return this.nodesInGraph.size();
  }




  // Breadth First


  public HashSet<T> breadthFirstTraverse(Node<T> startingNode) {
    LinkedList<Node<T>> queueOfNodesToProcess = new LinkedList<>();
    HashSet<Node<T>> seen = new HashSet<>();
    HashSet<T> answerList = new HashSet<>();

    // Add starting node to queue
    queueOfNodesToProcess.add(startingNode);

    // Iterate while queue is empty
    while (!queueOfNodesToProcess.isEmpty()) {
      Node<T> currentNode = queueOfNodesToProcess.removeFirst();
      // If not seen, process
      if (!seen.contains(currentNode)) {
        seen.add(currentNode);
        answerList.add(currentNode.getValue());
      }

      // Get current neighbor nods
      HashSet<Node<T>> setOfNeighborNodes = getNeighborNodes(currentNode);

      // Check neighbor nodes for unseen neighbors and add to queue
      for (Node<T> neighbor : setOfNeighborNodes) {
        if (!seen.contains(neighbor)) {
          queueOfNodesToProcess.add(neighbor);
        }
      }
    }
    return answerList;
  }


}


