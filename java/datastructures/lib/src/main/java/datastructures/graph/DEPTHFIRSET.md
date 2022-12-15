# Depth First
<!-- Short summary or background information -->
A depth-first traversal is where we prioritize going through the depth (height) of the tree first. We explore each branch completely before moving on to the next branch. This is a depth first search because it traverses the graph depth first. It starts at the starting node and then moves to the neighbors of the starting node. It then moves to the neighbors of the neighbors of the starting node. It continues to do this until it has visited all the nodes in the graph.

## Challenge
<!-- Description of the challenge -->
Implement a depth first search on a graph.

## Approach & Efficiency
<!-- What approach did you take? Why? What is the Big O space/time for this approach? -->

The approach I took was to create a Graph class that would hold a list of nodes. I then created a Node class that would hold a list of neighbors. I then created a depth first method that would take in a starting node and return a list of nodes in the order they were visited. I used a stack to keep track of the nodes to visit. I started by adding the starting node to the stack. I then looped through the stack and added the neighbors of the current node to the stack. I then removed the current node from the stack. I continued to loop through the stack until the stack was empty. The nodes were visited in the order they were added to the stack. This is a depth first search because it traverses the graph depth first. It starts at the starting node and then moves to the neighbors of the starting node. It then moves to the neighbors of the neighbors of the starting node. It continues to do this until it has visited all the nodes in the graph.

The Big O for the depth first method is O(n).

## API
<!-- Description of each method publicly available in each of your Graph -->
- depthFirst
  - Takes in a starting node and returns a list of nodes in the order they were visited

## Code

- [Depth First](https://github.com/mtorres6739/data-structures-and-algorithms/blob/main/java/datastructures/lib/src/main/java/datastructures/graph/DepthFirst.java)
- [Depth First Test](https://github.com/mtorres6739/data-structures-and-algorithms/blob/main/java/datastructures/lib/src/test/java/datastructures/graph/DepthFirstTest.java)

```java
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
```

### References

- [Depth First Search: Geeks for geeks](https://www.geeksforgeeks.org/depth-first-search-or-dfs-for-a-graph/)
- [Depth First Traversal: Tutorials Point](https://www.tutorialspoint.com/data_structures_algorithms/depth_first_traversal.htm)
- [Depth First: Programiz](https://www.programiz.com/dsa/graph-dfs)
- [Depth First Graph Traverse: Youtube-back geeks for geeks](https://www.youtube.com/watch?v=Y40bRyPQQr0)
- [Depth First vs Breadth First Graph: Youtube-Stephen O'Neil](https://www.youtube.com/watch?v=62IcXF_OF3k)
- [Depth First Search Alo Graph Theory: Youtube - William Fiset](https://www.youtube.com/watch?v=7fujbpJ0LB4)
- [Github Sharina](https://github.com/SharinaS)
- [Github Ben](https://github.com/akkanben)
- [Github Roger](https://github.com/RogerMReyes)
