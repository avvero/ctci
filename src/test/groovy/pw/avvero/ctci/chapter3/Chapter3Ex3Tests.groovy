package pw.avvero.ctci.chapter3


import spock.lang.Specification
import spock.lang.Unroll

class Chapter3Ex3Tests extends Specification {

    @Unroll
    def "1: #Stack implementation"() {
        when:
        def stack = new StackPack(3)
        stack.push("2")
        then:
        stack.peek() == "2"
        stack.toString() == '[{0,[2]}]'
        when:
        stack.push("1")
        then:
        stack.peek() == "1"
        stack.toString() == '[{0,[1, 2]}]'
        when:
        stack.push("3")
        then:
        stack.peek() == "3"
        stack.toString() == '[{0,[3, 1, 2]}]'
        when:
        stack.push("4")
        then:
        stack.peek() == "4"
        stack.toString() == '[{1,[4]}, {0,[3, 1, 2]}]'
        when:
        stack.push("5")
        then:
        stack.peek() == "5"
        stack.toString() == '[{1,[5, 4]}, {0,[3, 1, 2]}]'
        when:
        stack.push("6")
        then:
        stack.peek() == "6"
        stack.toString() == '[{1,[6, 5, 4]}, {0,[3, 1, 2]}]'
        and:
        stack.popAt(0) == "3"
        stack.toString() == '[{1,[6, 5, 4]}, {0,[1, 2]}]'
        and:
        stack.pop() == "6"
        stack.pop() == "5"
        stack.pop() == "4"
        and:
        stack.toString() == '[{0,[1, 2]}]'
        and:
        stack.pop() == "1"
        stack.pop() == "2"
        and:
        stack.peek() == null
        stack.toString() == '[]'
    }
}
