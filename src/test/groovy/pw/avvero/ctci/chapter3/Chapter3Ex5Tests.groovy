package pw.avvero.ctci.chapter3


import spock.lang.Specification
import spock.lang.Unroll

class Chapter3Ex5Tests extends Specification {

    @Unroll
    def "Queue with two stacks"() {
        when:
        def queue = new QueueStack()
        then:
        queue.toString() == '[]'
        when:
        queue.add(1)
        queue.add(2)
        queue.add(3)
        then:
        queue.toString() == '[1, 2, 3]'
        and:
        queue.peek() == 1
        queue.pop() == 1
        queue.pop() == 2
        queue.pop() == 3
        and:
        queue.toString() == '[]'
    }
}
