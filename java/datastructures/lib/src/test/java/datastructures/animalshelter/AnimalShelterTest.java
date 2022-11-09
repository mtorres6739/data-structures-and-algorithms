package datastructures.animalshelter;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class AnimalShelterTest {

  @Test
  void testForEnqueueAnimal() {
    AnimalShelter sut = new AnimalShelter();
    sut.enqueue(new Animal("cat"));
    assertEquals(sut.size(), 1);
  }

  @Test
  void testForEnqueueAnimals() {
    AnimalShelter sut = new AnimalShelter();
    sut.enqueue(new Animal("cat"));
    sut.enqueue(new Animal("dog"));
    assertEquals(sut.size(), 2);
  }


  @Test
  void testForDequeueAnimalFront() {
    AnimalShelter sut = new AnimalShelter();
    sut.enqueue(new Animal("cat"));
    sut.enqueue(new Animal("dog"));
    sut.enqueue(new Animal("dog"));
    sut.enqueue(new Animal("dog"));
    assertEquals(sut.size(), 4);
    assertEquals(sut.dequeue("cat").getSpecies(), "cat");
    assertEquals(sut.size(), 3);
  }

  @Test
  void testForDequeueAnimalBack() {
    AnimalShelter sut = new AnimalShelter();
    sut.enqueue(new Animal("cat"));
    sut.enqueue(new Animal("dog"));
    sut.enqueue(new Animal("dog"));
    sut.enqueue(new Animal("dog"));
    assertEquals(sut.size(), 4);
    assertEquals(sut.dequeue("cat").getSpecies(), "cat");
    assertEquals(sut.size(), 3);
  }

  @Test
  void testForDequeueAnimalNotFound() {
    AnimalShelter sut = new AnimalShelter();
    sut.enqueue(new Animal("cat"));
    assertNull(sut.dequeue("dog"));
  }


  @Test
  void testForDequeueAnimalsNotFound() {
    AnimalShelter sut = new AnimalShelter();
    sut.enqueue(new Animal("dog"));
    sut.enqueue(new Animal("dog"));
    sut.enqueue(new Animal("cat"));
    sut.enqueue(new Animal("dog"));
    sut.enqueue(new Animal("dog"));
    sut.dequeue("cat");
    assertNull(sut.dequeue("cat"));
  }
}
