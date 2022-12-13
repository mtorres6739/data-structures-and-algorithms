package datastructures.graph;

import java.util.LinkedList;
import java.util.List;

public class Node<T> {
  private T value;
  private List<Edge<T>> listNeighborsWeightAndNode;

  public Node (T value) {
    this.value = value;
    this.listNeighborsWeightAndNode = new LinkedList<>();
  }

  public Node () {
    this.listNeighborsWeightAndNode = new LinkedList<>();
  }

  public boolean addEdgeToListOfEdges(Node<T> nodeTHeEdgePointsTo, int weight) {
    Edge<T> newEdge = new Edge<>(weight, nodeTHeEdgePointsTo);
    return this.listNeighborsWeightAndNode.add(newEdge);
  }

  public  T getValue() {
    return value;
  }

  public List<Edge<T>> getListNeighborsWeightAndNode() {
    return listNeighborsWeightAndNode;
  }
}
