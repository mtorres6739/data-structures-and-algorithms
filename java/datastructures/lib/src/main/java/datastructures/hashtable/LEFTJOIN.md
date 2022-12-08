# Left Join
<!-- Short summary or background information -->

A left join is a function that takes in two hash tables and returns a new hash table with the values from the first hash table and the values from the second hash table that match the keys in the first hash table. If there are no matches, the value will be null.

## Challenge
<!-- Description of the challenge -->

Write a function called left_join that takes in two hash tables and returns a new hash table with the values from the first hash table and the values from the second hash table that match the keys in the first hash table. If there are no matches, the value will be null.

## Approach & Efficiency
<!-- What approach did you take? Why? What is the Big O space/time for this approach? -->

The approach I took was to create a method that would take in two hash tables. I then created a method that would traverse the first hash table and add the values to a new hash table. I then created a method that would traverse the second hash table and check if the keys were in the new hash table. If the key was in the new hash table, I would add the value from the second hash table to the new hash table. I then returned the new hash table. If the key was not in the new hash table, I would add the value from the second hash table as null. I then returned the new hash table.

The Big O for the left_join method is O(n).

## API
<!-- Description of each method publicly available in each of your hashtable -->

- left_join
  - Takes in two hash tables and returns a new hash table with the values from the first hash table and the values from the second hash table that match the keys in the first hash table. If there are no matches, the value will be null.

## Code

- [Left Join](https://github.com/mtorres6739/data-structures-and-algorithms/blob/main/java/datastructures/lib/src/main/java/datastructures/hashtable/LeftJoing.java)
- [Left Join Tests](https://github.com/mtorres6739/data-structures-and-algorithms/blob/main/java/datastructures/lib/src/test/java/datastructures/hashtableTest/LeftJoing.java)

```java
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
