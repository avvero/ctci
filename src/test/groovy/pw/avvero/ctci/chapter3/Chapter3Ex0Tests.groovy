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
        def stack = new Queue()
        stack.add("2")
        then:
        stack.peek() == "2"
        stack.toString() == '[2]'
        when:
        stack.add("1")
        then:
        stack.peek() == "2"
        stack.toString() == '[2, 1]'
        when:
        stack.poll() == "2"
        stack.poll() == "1"
        then:
        stack.peek() == null
        stack.toString() == '[]'
    }
}
