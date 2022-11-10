# Validate Brackets Code Challenge

## Code Challenge 13 - Validate Brackets

Create a method that takes in a string and returns a boolean if the brackets are balanced.

### Validate Brackets Whiteboard

![Validate Brackets Whiteboard](/java/datastructures/lib/src/main/java/assets/img/CodeChallenge13Whiteboard.png)

### Code

```java
  public static boolean validateBrackets (String input) {
    Stack<String> stringStack = new Stack<>();

    if (input.length() < 2) {
      return false;
    }

    for (int i = 0; i < input.length(); i++) {
      String element = Character.toString(input.charAt(i));

      if (element.equals("(") || element.equals("[") || element.equals("{")) {
        stringStack.push(element);

      } else if (element.equals(")")) {
        if (!stringStack.pop().equals("(")) {
          return false;
        }
      } else if (element.equals("]")) {
        if (!stringStack.pop().equals("[")) {
          return false;
        }
      } else if (element.equals("}")) {
        if (!stringStack.pop().equals("{")) {
          return false;
        }
      }
    }
    return stringStack.isEmpty();
  }
```

### Validate Brackets - Methods Implemented

Time complexity is O(n).

#### validateBrackets()

Takes in a string and returns a boolean if the brackets are balanced.

#### Attribution

- [Github Ben](https://github.com/akkanben)
- [Github Sharina](https://github.com/SharinaS)
