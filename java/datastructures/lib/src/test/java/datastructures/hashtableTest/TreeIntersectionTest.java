package datastructures.hashtableTest;

import datastructures.hashtable.TreeIntersection;
import datastructures.tree.Node;
import org.junit.jupiter.api.Test;

import java.util.HashSet;

public class TreeIntersectionTest {

  @Test
  public void testForTreeIntersection1(){
    //               20
    //              /  \
    //            15    25
    //            / \   / \
    //          12  17  22  27

    Node root1 = new Node(20,
      new Node(15, new Node(12), new Node(17)),
      new Node(25, new Node(22), new Node(27)));

    //             15
    //            /  \
    //          10    12

    Node root2 = new Node(15,
      new Node(10), new Node(12));

    HashSet<Integer> expected = new HashSet<>();
    expected.add(12);
    expected.add(15);

    System.out.println(TreeIntersection.treeIntersection(root1, root2));

  }



  @Test
  public void testForTreeIntersection2() {
    //               20
    //              /  \
    //            15    25
    //            / \   / \
    //          12  17  22  27

    Node root1 = new Node(20,
      new Node(15, new Node(12), new Node(17)),
      new Node(25, new Node(22), new Node(27)));

    //             14
    //            /  \
    //           9    10

    Node root2 = new Node(14,
      new Node(9), new Node(10));

    HashSet<Integer> expected = new HashSet<>();
    //expected is empty
    System.out.println(TreeIntersection.treeIntersection(root1, root2));
  }




  @Test
  public void testForTreeIntersection3() {
    //               20
    //              /  \
    //            15    25
    //            / \   / \
    //          12  17  22  27

    Node root1 = new Node(20,
      new Node(15, new Node(12), new Node(17)),
      new Node(25, new Node(22), new Node(27)));

    //             15
    //            /  \
    //          10    12
    //         /  \
    //       22    27

    Node root2 = new Node(15,
      new Node(10, new Node(22), new Node(27)),
      new Node(12));

    HashSet<Integer> expected = new HashSet<>();
    expected.add(12);
    expected.add(15);
    expected.add(22);
    expected.add(27);
    expected.toArray();
    System.out.println(TreeIntersection.treeIntersection(root1, root2));
  }









}
