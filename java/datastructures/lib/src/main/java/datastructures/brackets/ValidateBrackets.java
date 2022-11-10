package datastructures.brackets;

import datastructures.stacksandqueues.Stack;

public class ValidateBrackets {

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
}
