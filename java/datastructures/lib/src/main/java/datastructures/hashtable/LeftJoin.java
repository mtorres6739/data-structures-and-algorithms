package datastructures.hashtable;

import java.util.ArrayList;

import java.util.LinkedList;

public class LeftJoin {

  public static ArrayList<String[]> leftJoin(Hashtable hashtable1, Hashtable hashtable2) {
    ArrayList<String[]> answer = new ArrayList<>();

    for (LinkedList<Entry> index : hashtable1.hashTableArray) {
      if (index != null) {
        for (Entry node : index) {
          answer.add(new String[]{node.key, node.value, hashtable2.contains(node.key) ?
          hashtable2.get(node.key) : null});
        }
      }
    }
    return answer;
  }




}
