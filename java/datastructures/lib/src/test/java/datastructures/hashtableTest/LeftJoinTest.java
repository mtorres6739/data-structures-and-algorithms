package datastructures.hashtableTest;

import datastructures.hashtable.Hashtable;
import datastructures.hashtable.LeftJoin;
import org.junit.Before;
import org.junit.jupiter.api.Test;


import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

public class LeftJoinTest {
  Hashtable hashtable1;
  Hashtable hashtable2;


  @Test
  public void testForLeftJoin1() {

    hashtable1 = new Hashtable();
    hashtable1.add("diligent", "employed");
    hashtable1.add("fond", "enamored");
    hashtable1.add("guide", "usher");

    hashtable2 = new Hashtable();
    hashtable2.add("diligent", "idle");
    hashtable2.add("fond", "averse");
    hashtable2.add("guide", "follow");

    // answer ArrayList
    String[] one = {"diligent", "employed", "idle"};
    String[] two = {"fond", "enamored", "averse"};
    String[] three = {"guide", "usher", "follow"};
    ArrayList<String[]> expected = new ArrayList<>();
    expected.add(one);
    expected.add(two);
    expected.add(three);

    System.out.println(LeftJoin.leftJoin(hashtable1, hashtable2));
    ArrayList<String[]> ans = LeftJoin.leftJoin(hashtable1, hashtable2);
    for (String[] arr : ans) {
      System.out.println(Arrays.toString(arr));
    }
  }

  @Test
  public void testForLeftJoin2() {

    hashtable1 = new Hashtable();
    hashtable1.add("diligent", "employed");
    hashtable1.add("fond", "enamored");
    hashtable1.add("guide", "usher");

    hashtable2 = new Hashtable();
    hashtable2.add("diligent", "idle");
    hashtable2.add("fond", "averse");


    // answer ArrayList
    String[] one = {"diligent", "employed", "idle"};
    String[] two = {"fond", "enamored", "averse"};
    String[] three = {"guide", "usher", "follow"};
    ArrayList<String[]> expected = new ArrayList<>();
    expected.add(one);
    expected.add(two);
    expected.add(three);

    System.out.println(LeftJoin.leftJoin(hashtable1, hashtable2));
    ArrayList<String[]> ans = LeftJoin.leftJoin(hashtable1, hashtable2);
    for (String[] arr : ans) {
      System.out.println(Arrays.toString(arr));
    }
  }


  @Test
  public void testForLeftJoin3() {

    hashtable1 = new Hashtable();
    hashtable1.add("diligent", "employed");
    hashtable1.add("fond", "enamored");

    hashtable2 = new Hashtable();
    hashtable2.add("diligent", "idle");
    hashtable2.add("fond", "averse");
    hashtable2.add("guide", "follow");


    // answer ArrayList
    String[] one = {"diligent", "employed", "idle"};
    String[] two = {"fond", "enamored", "averse"};
    String[] three = {"guide", "usher", "follow"};
    ArrayList<String[]> expected = new ArrayList<>();
    expected.add(one);
    expected.add(two);
    expected.add(three);

    System.out.println(LeftJoin.leftJoin(hashtable1, hashtable2));
    ArrayList<String[]> ans = LeftJoin.leftJoin(hashtable1, hashtable2);
    for (String[] arr : ans) {
      System.out.println(Arrays.toString(arr));
    }


  }

}
