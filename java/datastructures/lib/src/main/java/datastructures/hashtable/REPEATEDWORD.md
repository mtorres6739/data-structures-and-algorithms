# Repeated Word

## Challenge

Write a function that accepts a lengthy string parameter. Without utilizing any of the built-in library methods available to your language, return the first word to occur more than once in that provided string.

## Approach & Efficiency

The approach I took was to create a HashTable class that would hold an array of LinkedLists. I then created the methods for the HashTable class. I then created a method that would take in a string and return the first word that occurs more than once.

The Big O for the repeatedWord method is O(n).

## API

- repeatedWord
  - Takes in a string and returns the first word that occurs more than once.

## Code

- [Repeated Word](/java/datastructures/lib/src/main/java/datastructures/hashtable/RepeatedWord.java)
- [Repeated Word Tests](/java/datastructures/lib/src/test/java/datastructures/hashtableTest/RepeatedWordTest.java)

```java

public String repeatedWord (String stringToRead) throws UnsupportedEncodingException {
    Scanner readString = new Scanner(stringToRead);
    Hashtable hashtable = new Hashtable();

    while (readString.hasNext()) {
      String word = readString.next().toLowerCase();
      if (hashtable.contains(word)) {
        return word;
      } else {
        hashtable.add(word, null);
      }
    }
    return null;
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

