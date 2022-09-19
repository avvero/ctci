package pw.avvero.ctci.chapter3


import spock.lang.Specification
import spock.lang.Unroll

class Chapter3Ex2Tests extends Specification {

    @Unroll
    def "1: #Stack implementation"() {
        when:
        def stack = new MinStack()
        stack.push(2)
        then:
        stack.peek() == 2
        stack.toString() == '[2]'
        stack.min() == 2
        when:
        stack.push(1)
        then:
        stack.peek() == 1
        stack.toString() == '[1, 2]'
        stack.min() == 1
        when:
        stack.push(3)
        then:
        stack.peek() == 3
        stack.toString() == '[3, 1, 2]'
        stack.min() == 1
        and:
        stack.pop() == 3
        stack.min() == 1
        and:
        stack.pop() == 1
        stack.min() == 2
        and:
        stack.pop() == 2
        then:
        stack.peek() == null
        stack.toString() == '[]'
    }
}
