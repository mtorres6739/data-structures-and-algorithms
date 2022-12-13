package datastructures.graph;

public class Edge<T> {
  // == Instance Variables ==
  private int weight;
  private Node<T> theNodeTheEdgeIsPointingTo;

  // == Constructors ==
  public Edge (int weight, Node node) {
    this.weight = weight;
    this.theNodeTheEdgeIsPointingTo = node;
  }

  public Edge (Node node) {
    this.theNodeTheEdgeIsPointingTo = node;
    this.weight = weight;
  }

  // == Getters ==
  public int getWeight() {
    return weight;
  }

  public Node<T> getTheNodeTheEdgeIsPointingTo() {
    return theNodeTheEdgeIsPointingTo;
  }
}
