package datastructures.graph2;

import datastructures.linkedlist2.LinkedList;
import datastructures.linkedlist2.Node;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


public class Graph<T extends Comparable<? super T>> implements Comparable<Graph<T>>  // just in case you have Comparable data structures
{
  private final HashMap<Vertex<T>, LinkedList<Edge<T>>> adjacencyLists;
  private int size = 0;

  public Graph() {
    adjacencyLists = new HashMap<>();
  }

  public Graph(int size) {
    adjacencyLists = new HashMap<>(size);
  }

  public Vertex<T> addVertex(T value) {
    Vertex<T> newVertex = new Vertex<>(value);
    if (adjacencyLists.get(newVertex) == null) {
      adjacencyLists.put(newVertex, null);
      size++;
    }
    return newVertex;
  }

  public void addEdge(Vertex<T> v1, Vertex<T> v2, int weight) {
    Edge<T> newEdge = new Edge<>(v2, weight);
    if (adjacencyLists.get(v1) == null) {
      LinkedList<Edge<T>> newLinkedList = new LinkedList<>();
      newLinkedList.append(newEdge);
      adjacencyLists.put(v1, newLinkedList);
    } else {
      LinkedList<Edge<T>> existingLinkedList = adjacencyLists.get(v1);
      existingLinkedList.append(newEdge);
      adjacencyLists.put(v1, existingLinkedList);
    }
  }

  public void addEdge(Vertex<T> v1, Vertex<T> v2) {
    addEdge(v1, v2, 0);
  }

  public List<Vertex<T>> getVertices() {
    List<Vertex<T>> list = new ArrayList<>();
    for (Vertex<T> vertex : adjacencyLists.keySet()) {
      list.add(vertex);
    }
    return list;
  }

  public List<Edge<T>> getNeighbors(Vertex<T> vertex) {
    List<Edge<T>> list = new ArrayList<>();
    LinkedList<Edge<T>> edgeLinkedList = adjacencyLists.get(vertex);
    if (edgeLinkedList != null) {
      Node<Edge<T>> current;
      current = edgeLinkedList.head;
      while (current != null) {
        list.add(current.value);
        current = current.next;
      }
    }
    return list;
  }

  public int size()
  {
    return size;  // TODO: make sure this gets updated at the right times
  }

  @Override
  public int compareTo(Graph<T> o)
  {
    throw new UnsupportedOperationException("Graph does not implement compareTo()");
  }

  @Override
  public String toString()
  {
    // Good for testing
    // WARNING: Your HashMap does not guarantee ordering!
    // But you can basically rely on it if you add nodes to your graphs in a consistent way

    return "";
  }
}
