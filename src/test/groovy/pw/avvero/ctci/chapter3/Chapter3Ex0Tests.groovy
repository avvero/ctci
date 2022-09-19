package pw.avvero.ctci.chapter3


import spock.lang.Specification
import spock.lang.Unroll

class Chapter3Ex0Tests extends Specification {

    @Unroll
    def "1: #Stack implementation"() {
        when:
        def stack = new Stack()
        stack.push("2")
        then:
        stack.peek() == "2"
        stack.toString() == '[2]'
        when:
        stack.push("1")
        then:
        stack.peek() == "1"
        stack.toString() == '[1, 2]'
        when:
        stack.pop() == "1"
        stack.pop() == "2"
        then:
        stack.peek() == null
        stack.toString() == '[]'
    }

    @Unroll
    def "1: #Queue implementation"() {
        when:
        def queue = new Queue()
        queue.add("2")
        then:
        queue.peek() == "2"
        queue.toString() == '[2]'
        when:
        queue.add("1")
        then:
        queue.peek() == "2"
        queue.toString() == '[2, 1]'
        when:
        queue.poll() == "2"
        queue.poll() == "1"
        then:
        queue.peek() == null
        queue.toString() == '[]'
    }
}
