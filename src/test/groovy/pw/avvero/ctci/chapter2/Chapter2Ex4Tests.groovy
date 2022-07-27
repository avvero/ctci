package pw.avvero.ctci.chapter2

import spock.lang.Specification
import spock.lang.Unroll

class Chapter2Ex4Tests extends Specification {

    @Unroll
    def "1: #list ordered around #element is #result"() {
        expect:
        Chapter2Ex4.order(Node.of(list), element) == Node.of(result)
        where:
        list                     | element || result
        [7, 4, 6, 5, 1, 8, 3, 2] | 2       || [1, 2, 7, 4, 6, 5, 8, 3]
        [7, 4, 6, 5, 1, 8, 3, 2] | 5       || [4, 1, 3, 2, 5, 7, 6, 8]
    }
}
