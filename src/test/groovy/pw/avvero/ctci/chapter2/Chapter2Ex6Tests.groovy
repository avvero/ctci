package pw.avvero.ctci.chapter2

import spock.lang.Specification
import spock.lang.Unroll

class Chapter2Ex6Tests extends Specification {

    @Unroll
    def "1: in #list starts with #result"() {
        expect:
        Chapter2Ex6.find(Node.of(list))?.value == result
        where:
        list                           || result
        ["a", "b", "c", "d", "e", "a"] || "a"
        ["a", "b", "c", "d", "e", "c"] || "c"
        ["a", "b", "c", "d", "e", "f"] || "a"
    }

    @Unroll
    def "2: in #list starts with #result"() {
        when:
        def joint = Node.of("a")
        joint.next = Node.of("b", Node.of("c", Node.of("d", Node.of("e", joint))))
        then:
        Chapter2Ex6.find(joint)?.value == "a"
        Chapter2Ex6.find2(joint)?.value == "a"
    }

    @Unroll
    def "3: in #list starts with #result"() {
        when:
        def e = Node.of("e")
        def d = Node.of("d", e)
        def c = Node.of("с", d)
        def b = Node.of("b", c)
        def a = Node.of("a", b)
        e.next = c
        then:
        Chapter2Ex6.find(a)?.value == "с"
        Chapter2Ex6.find2(a)?.value == "с"
    }
}
