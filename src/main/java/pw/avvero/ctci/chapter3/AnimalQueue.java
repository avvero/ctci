package pw.avvero.ctci.chapter3;

import java.util.Objects;

public class AnimalQueue {

    private Queue<Animal> queue = new Queue<>();

    public static class Animal {
        private String name;

        public Animal(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return this.getClass().getSimpleName() + " " + name;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Animal animal = (Animal) o;
            return Objects.equals(name, animal.name);
        }
    }
    public static class Dog extends Animal {
        public Dog(String name) {
            super(name);
        }
    }
    public static class Cat extends Animal {
        public Cat(String name) {
            super(name);
        }
    }

    public void enqueue(Animal animal) {
        queue.add(animal);
    }

    public Animal dequeueAny() {
        return queue.poll();
    }

    public Dog dequeueDog() {
        return (Dog) queue.poll();
    }

    public Cat dequeueCat() {
        return (Cat) queue.poll();
    }

    @Override
    public String toString() {
        return queue.toString();
    }
}
