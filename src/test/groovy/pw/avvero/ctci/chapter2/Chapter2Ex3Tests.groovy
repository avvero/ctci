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
        list         | element || result
        [1]          | 1       || []
        [1, 2]       | 1       || [2]
        [1, 2, 3]    | 1       || [2, 3]
        [1, 2, 3]    | 2       || [1, 3]
        [1, 2, 3]    | 4       || [1, 2, 3]
        [1, 2, 3, 3] | 2       || [1, 3]
    }
}
