# Breadth First
<!-- Short summary or background information -->
A breadth first search is a traversal method that starts at a given node and traverses the graph layer by layer. It uses a queue to keep track of the nodes to visit. It starts by adding the starting node to the queue. It then loops through the queue and adds the neighbors of the current node to the queue. It then removes the current node from the queue. It continues to loop through the queue until the queue is empty. The nodes are visited in the order they are added to the queue. This is a breadth first search because it traverses the graph layer by layer. It starts at the starting node and then moves to the neighbors of the starting node. It then moves to the neighbors of the neighbors of the starting node. It continues to do this until it has visited all the nodes in the graph.

## Challenge
<!-- Description of the challenge -->
Implement a breadth first search on a graph.


## Approach & Efficiency
<!-- What approach did you take? Why? What is the Big O space/time for this approach? -->

The approach I took was to create a Graph class that would hold a list of nodes. I then created a Node class that would hold a list of neighbors. I then created a breadth first method that would take in a starting node and return a list of nodes in the order they were visited. I used a queue to keep track of the nodes to visit. I started by adding the starting node to the queue. I then looped through the queue and added the neighbors of the current node to the queue. I then removed the current node from the queue. I continued to loop through the queue until the queue was empty. The nodes were visited in the order they were added to the queue. This is a breadth first search because it traverses the graph layer by layer. It starts at the starting node and then moves to the neighbors of the starting node. It then moves to the neighbors of the neighbors of the starting node. It continues to do this until it has visited all the nodes in the graph.

The Big O for the breadth first method is O(n).

## API
<!-- Description of each method publicly available in each of your Graph -->
- breadth first
  - Takes in a starting node and returns a list of nodes in the order they were visited.

## Code

- [Breadth First](https://github.com/mtorres6739/data-structures-and-algorithms/blob/main/java/datastructures/lib/src/main/java/datastructures/graph/Graph.java)
- [Breadth First Tests](https://github.com/mtorres6739/data-structures-and-algorithms/blob/main/java/datastructures/lib/src/test/java/datastructures/graph/GraphTest.java)

```java
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

```

### References

- [Breadth First Search: Geeks for geeks](https://www.geeksforgeeks.org/breadth-first-search-or-bfs-for-a-graph/)
- [Breadth First Search Graph: wikipedia](https://en.wikipedia.org/wiki/Breadth-first_search)
- [Breadth First Search Graph: Youtube-williamFiset](https://www.google.com/search?q=breadth+first+search+graph&oq=breadth+first+search+gr&aqs=chrome.0.0i512j69i57j0i512l8.7390j0j4&sourceid=chrome&ie=UTF-8#fpstate=ive&vld=cid:622c9be1,vid:oDqjPvD54Ss)
- [Breadth First Search: Youtube-back to back swe](https://www.youtube.com/watch?v=TIbUeeksXcI)
- [Depth First vs Breadth First Graph: Youtube-Stephen O'Neil](https://www.youtube.com/watch?v=62IcXF_OF3k)
- [Breadth First Search for Graph: Youtube - codejungle](https://www.youtube.com/watch?v=AZShaTqv_8o)
- [Github Sharina](https://github.com/SharinaS)
- [Github Ben](https://github.com/akkanben)
- [Github Roger](https://github.com/RogerMReyes)
