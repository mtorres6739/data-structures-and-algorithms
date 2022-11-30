package datastructures.hashtable;

import java.util.LinkedList;

public class Hashtable {
  LinkedList<Entry>[] hashTableArray = new LinkedList[100]; // Array of linked lists make this public

  // add: takes in both the key and value.
  public boolean add (String key, String value) {
    // takes a key and turns it into a hash
    int arrIndex = hash(key);
    Entry entry = new Entry(key, value);

    if (hashTableArray[arrIndex] == null) {
      hashTableArray[arrIndex] = new LinkedList<>();
    }

    if(contains(key)) {
      return false;  // key is already in use
    } else {
      hashTableArray[arrIndex].add(entry); // add key value pair to  linked list.
    }
    return true;
  }

  // get: take in the key. return  value from table.
  public String get (String key) {
    // String hashed to hashed key. index to find linked list.
    int arrIndex = hash(key);

    if (hashTableArray[arrIndex] == null) {
      hashTableArray[arrIndex] = new LinkedList<>();
    }
    for (int i = 0; i < hashTableArray[arrIndex].size(); i++) {
      // if hashtable is same as key supplied, return value
      if (hashTableArray[arrIndex].get(i).key.equals(key)){
        return hashTableArray[arrIndex].get(i).value;
      }
    }
    return null;
  }

  // contains: takes in the key and returns a boolean if key already exists
  public boolean contains (String key) {
    int arrIndex = hash(key);

    if (hashTableArray[arrIndex] == null) {
      hashTableArray[arrIndex] = new LinkedList<>();
    }

    for (int i = 0; i < hashTableArray[arrIndex].size(); i++) {
      if (hashTableArray[arrIndex].get(i).key.equals(key)){
        return true; // returns true when key exists
      }
    }
    return false; // returns false when key does not exist
  }

  // hash: takes in an any key and returns index in the collection.
  // https://stackoverflow.com/questions/16458564/convert-character-to-ascii-numeric-value-in-java#targetText=Just%20cast%20your%20char%20as,%2F%2F%20ascii%20is%20now%2097.
  public int hash (String key) {
    int len = key.length();
    int addedAscii = 0;
    for (var i = 0; i < len; i ++) {
      char character = key.charAt(i);
      int ascii = (int) character;
      addedAscii += ascii;
    }
    return addedAscii * 599 % hashTableArray.length;

  }
}
