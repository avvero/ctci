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
        ["a", "b", "c", "d", "e", "c"] || "c"
        ["a", "b", "c", "d", "e", "f"] || "a"
    }

    @Unroll
    def "2: in #list starts with #result"() {
        expect:
        Chapter2Ex6.find2(Node.of(list))?.value == result
        where:
        list                           || result
        ["a", "b", "c", "d", "e", "c"] || "c"
        ["a", "b", "c", "d", "e", "f"] || "a"
    }
}
