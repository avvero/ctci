package pw.avvero.ctci.chapter2

import pw.avvero.ctci.chapter2.Chapter2Ex3
import pw.avvero.ctci.chapter2.Node
import spock.lang.Specification
import spock.lang.Unroll

class Chapter2Ex3Tests extends Specification {

    @Unroll
    def "1: #list without #element is #result"() {
        expect:
        Chapter2Ex3.remove(Node.of(list), element) == Node.of(result)
        where:
        list               | element || result
        [1, 2, 3]          | 2       || [1, 3]
        [1, 2, 3, 4, 5, 6] | 2       || [1, 3, 4, 5, 6]
        [1, 2, 3, 4, 5, 6] | 3       || [1, 2, 4, 5, 6]
        [1, 2, 3, 4, 5, 6] | 4       || [1, 2, 3, 5, 6]
        [1, 2, 3, 4, 5, 6] | 5       || [1, 2, 3, 4, 6]
    }
}
