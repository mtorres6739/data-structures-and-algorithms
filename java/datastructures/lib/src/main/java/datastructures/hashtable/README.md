# Hashtables
<!-- Short summary or background information -->
A hashtable is a data structure that utilizes key value pairs. This means every Node or Bucket has both a key, and a value. The key is used to map to a specific bucket. The value is the data that is stored in the bucket. The hash is what helps determine where the key should be placed in the hashtable. The hash is the result of some algorithm taking in an arbitrary key and converting it into an integer. This integer is then used to determine the index of the array where the key/value pair should be placed.

## Challenge
<!-- Description of the challenge -->
Implement a Hashtable with the following methods:
- add
- get
- contains
- hash

## Approach & Efficiency
<!-- What approach did you take? Why? What is the Big O space/time for this approach? -->
The approach I took was to create a Node class that would hold the key/value pair. I then created a LinkedList class that would hold the Nodes. I created a HashTable class that would hold an array of LinkedLists. I then created the methods for the HashTable class.

The Big O for the add, get, contains, hash method is O(1).
The Big O for the LinkedList and HashTable class is O(n).

## API
<!-- Description of each method publicly available in each of your hashtable -->
- add
  - Takes in both the key and value. This method should hash the key, and add the key and value pair to the table, handling collisions as needed.
- get
  - Takes in the key and returns the value from the table.
- contains
  - Takes in the key and returns a boolean, indicating if the key exists in the table already.
- hash
  - Takes in an arbitrary key and returns an index in the collection.

## Code

- [Hashtable](https://github.com/mtorres6739/data-structures-and-algorithms/blob/main/java/datastructures/lib/src/main/java/datastructures/hashtable/Hashtable.java)
- [HashMap Tests](https://github.com/mtorres6739/data-structures-and-algorithms/blob/main/java/datastructures/lib/src/test/java/datastructures/hashtableTest/HashtableTest.java)

```java

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

```

### References

- [Hashtable](https://www.geeksforgeeks.org/implementing-our-own-hash-table-with-separate-chaining-in-java/)
- [Hashing](https://www.geeksforgeeks.org/hashing-set-2-separate-chaining/)
- [Intro to Hash Tables](https://codefellows.github.io/common_curriculum/data_structures_and_algorithms/Code_401/class-30/resources/Hashtables.html)
- [What is a hash table](https://www.youtube.com/watch?v=MfhjkfocRR0)
- [Basics of hash tables](https://www.hackerearth.com/practice/data-structures/hash-tables/basics-of-hash-tables/tutorial/)
- [Hash table wiki](https://en.wikipedia.org/wiki/Hash_table)
- [Github Sharina](https://github.com/SharinaS)
- [Github Ben](https://github.com/akkanben)
- [Github Roger](https://github.com/RogerMReyes)
