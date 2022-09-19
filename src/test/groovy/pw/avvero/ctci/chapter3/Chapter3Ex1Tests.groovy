package pw.avvero.ctci.chapter3


import spock.lang.Specification
import spock.lang.Unroll

class Chapter3Ex1Tests extends Specification {

    @Unroll
    def "1: #Stack implementation"() {
        when:
        def stack = new ListStack(3)
        stack.push(0, "2")
        stack.push(2, "12")
        then:
        stack.toString() == '[2,null,12,]'
        stack.peek(0) == "2"
        stack.peek(2) == "12"
        when:
        stack.push(0, "1")
        stack.push(2, "11")
        then:
        stack.toString() == '[2,null,12,1,null,11,]'
        stack.peek(0) == "1"
        stack.peek(2) == "11"
        and:
        stack.pop(0) == "1"
        stack.pop(0) == "2"
        stack.pop(2) == "11"
        stack.pop(2) == "12"
        and:
        stack.peek(0) == null
        stack.peek(2) == null
        when:
        stack.push(0, "2")
        stack.push(2, "12")
        then:
        stack.toString() == '[2,null,12,]'
    }
}
