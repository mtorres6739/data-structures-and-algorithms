package datastructures.animalshelter;

import datastructures.stacksandqueues.Stack;

public class AnimalShelter {

  Stack<Animal> front;
  Stack<Animal> back;
  int size;

  public AnimalShelter() {
    front = new Stack<>();
    back = new Stack<>();
  }

  public void enqueue(Animal animal) {
    back.push(animal);
    size++;
  }

  public Animal dequeue(String pref) {
    if (back.isEmpty()) {
      System.out.println(pref + " no animal found.");
      return null;
    }
    while (!back.isEmpty())
      front.push(back.pop());
    while (!front.isEmpty() && !front.peek().species.equals(pref))
      back.push(front.pop());
    if (front.isEmpty()) {
      System.out.println(pref + " no animal found.");
      return null;
    } else {
      Animal animalOut = front.pop();
      while (!front.isEmpty())
        back.push(front.pop());
      size--;
      return animalOut;
    }
  }

  public int size() {
    return size;
  }
}
