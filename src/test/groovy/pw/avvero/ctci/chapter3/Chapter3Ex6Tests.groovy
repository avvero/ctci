package pw.avvero.ctci.chapter3


import spock.lang.Specification
import spock.lang.Unroll

class Chapter3Ex6Tests extends Specification {

    @Unroll
    def "Method sorts stack in ascending way"() {
        when:
        def stack = new Stack()
        then:
        stack.toString() == '[]'
        when:
        stack.push(3)
        then:
        stack.toString() == '[3]'
        when:
        Stacks.sort(stack)
        then:
        stack.toString() == '[3]'
        when:
        stack.push(2)
        stack.push(5)
        stack.push(1)
        then:
        stack.peek() == 1
        stack.toString() == '[1, 5, 2, 3]'
        when:
        Stacks.sort(stack)
        then:
        stack.peek() == 5
        stack.toString() == '[5, 3, 2, 1]'
    }
}
