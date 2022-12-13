# Graph
<!-- Short summary or background information -->
A graph is a non-linear data structure that can be looked at as a collection of vertices (or nodes) potentially connected by line segments named edges. A graph can be either directed or undirected. A directed graph is a graph where each edge is directed. An undirected graph is a graph where each edge is undirected. A weighted graph is a graph where each edge has a weight. A graph can also be cyclic or acyclic. A cyclic graph is a graph where there is a path from a vertex back to itself. An acyclic graph is a graph where there is no path from a vertex back to itself. A complete graph is a graph where all vertices are connected to all other vertices. A connected graph is a graph where all vertices have at least one edge. A disconnected graph is a graph where some vertices do not have any edges.


## Challenge
<!-- Description of the challenge -->
Implement a Graph with the following methods:
- addNode
- addEdge
- getNodes
- getNeighbors
- size

## Approach & Efficiency
<!-- What approach did you take? Why? What is the Big O space/time for this approach? -->
The approach I took was to create a Node class that would hold the value of the node. I then created a Graph class that would hold a set of nodes. I created a method for the Graph class that would add a node to the set of nodes. I then created a method for the Graph class that would add an edge between two nodes. I then created a method for the Graph class that would get all the nodes in the graph. I then created a method for the Graph class that would get all the neighbors of a node. I then created a method for the Graph class that would get the size of the graph.



## API
<!-- Description of each method publicly available in each of your Graph -->
- addNode
  - Adds a new node to the graph
- addEdge
  - Adds a new edge between two nodes in the graph
- getNodes
  - Returns all of the nodes in the graph as a collection (set, list, or similar)
- getNeighbors
  - Returns a collection of edges connected to the given node
- size
  - Returns the total number of nodes in the graph


## Code

- [Graph](https://github.com/mtorres6739/data-structures-and-algorithms/blob/main/java/datastructures/lib/src/main/java/datastructures/graph/Graph.java)
- [Breadth First Tests](https://github.com/mtorres6739/data-structures-and-algorithms/blob/main/java/datastructures/lib/src/test/java/datastructures/graph/GraphTest.java)

```java
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

```

### References

- [Graphs: Geeks for Geeks](https://www.geeksforgeeks.org/graph-data-structure-and-algorithms/)
- [Graphs: Simplilearn](https://www.simplilearn.com/tutorials/data-structure-tutorial/graphs-in-data-structure)
- [Graphs: Tutorials Point](https://www.tutorialspoint.com/data_structures_algorithms/graph_data_structure.htm)
- [Graphs: Youtube-mycodeschool](https://www.youtube.com/watch?v=gXgEDyodOJU)
- [Graphs: Youtube-simple snippits](https://www.youtube.com/watch?v=4IZ80K72OXo)
- [Graphs: Youtube-codebasics](https://www.youtube.com/watch?v=j0IYCyBdzfA)
- [Github Sharina](https://github.com/SharinaS)
- [Github Ben](https://github.com/akkanben)
- [Github Roger](https://github.com/RogerMReyes)
