package pw.avvero.ctci.chapter3

import spock.lang.Specification
import spock.lang.Unroll
import pw.avvero.ctci.chapter3.AnimalQueue.Dog
import pw.avvero.ctci.chapter3.AnimalQueue.Cat

class Chapter3Ex7Tests extends Specification {

    @Unroll
    def "AnimalQueue returns oldest any animal"() {
        when:
        def queue = new AnimalQueue()
        queue.enqueue(new Dog("3"))
        queue.enqueue(new Dog("2"))
        queue.enqueue(new Cat("3"))
        queue.enqueue(new Dog("1"))
        queue.enqueue(new Cat("2"))
        queue.enqueue(new Cat("1"))
        then:
        queue.toString() == '[Dog 3, Dog 2, Cat 3, Dog 1, Cat 2, Cat 1]'
        and:
        queue.dequeue() == new Dog("3")
        and:
        queue.toString() == '[Dog 2, Cat 3, Dog 1, Cat 2, Cat 1]'
        and:
        queue.dequeue() == new Dog("2")
        and:
        queue.toString() == '[Cat 3, Dog 1, Cat 2, Cat 1]'
    }

    @Unroll
    def "AnimalQueue returns oldest dog"() {
        when:
        def queue = new AnimalQueue()
        queue.enqueue(new Dog("3"))
        queue.enqueue(new Dog("2"))
        queue.enqueue(new Cat("3"))
        queue.enqueue(new Dog("1"))
        queue.enqueue(new Cat("2"))
        queue.enqueue(new Cat("1"))
        then:
        queue.toString() == '[Dog 3, Dog 2, Cat 3, Dog 1, Cat 2, Cat 1]'
        and:
        queue.dequeue(Dog) == new Dog("3")
        and:
        queue.toString() == '[Dog 2, Cat 3, Dog 1, Cat 2, Cat 1]'
        and:
        queue.dequeue(Dog) == new Dog("2")
        and:
        queue.toString() == '[Cat 3, Dog 1, Cat 2, Cat 1]'
    }

    @Unroll
    def "AnimalQueue returns oldest cat"() {
        when:
        def queue = new AnimalQueue()
        queue.enqueue(new Dog("3"))
        queue.enqueue(new Dog("2"))
        queue.enqueue(new Cat("3"))
        queue.enqueue(new Dog("1"))
        queue.enqueue(new Cat("2"))
        queue.enqueue(new Cat("1"))
        then:
        queue.toString() == '[Dog 3, Dog 2, Cat 3, Dog 1, Cat 2, Cat 1]'
        and:
        queue.dequeue(Cat) == new Cat("3")
        and:
        queue.toString() == '[Dog 3, Dog 2, Dog 1, Cat 2, Cat 1]'
        and:
        queue.dequeue(Cat) == new Cat("2")
        and:
        queue.toString() == '[Dog 3, Dog 2, Dog 1, Cat 1]'
    }
}
