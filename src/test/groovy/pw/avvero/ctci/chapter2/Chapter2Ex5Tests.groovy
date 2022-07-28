package pw.avvero.ctci.chapter2

import spock.lang.Specification
import spock.lang.Unroll

class Chapter2Ex5Tests extends Specification {

    @Unroll
    def "1: #a + #b = #result (reversed)"() {
        expect:
        Chapter2Ex5.sumReversed(Node.of(a), Node.of(b), 0) == Node.of(result)
        where:
        a         | b         || result
        [7, 1, 6] | [5, 9, 2] || [2, 1, 9] // 617 + 295 = 912
        [7, 1]    | [5, 9, 2] || [2, 1, 3] // 17 + 295 = 312
        [7]       | [5, 9, 2] || [2, 1, 3] // 7 + 295 = 302
        [7, 1, 6] | [5, 9]    || [2, 1, 9] // 617 + 95 = 712
        [7, 1, 6] | [5]       || [2, 1, 9] // 617 + 5 = 622

    }

    @Unroll
    def "2: #a + #b = #result"() {
        expect:
        Chapter2Ex5.sum(Node.of(a), Node.of(b)) == Node.of(result)
        where:
        a         | b         || result
        [6, 1, 7] | [2, 9, 5] || [9, 1, 2] // 617 + 295 = 912
        [1, 7]    | [2, 9, 5] || [3, 1, 2] // 17 + 295 = 312
        [7]       | [2, 9, 5] || [3, 0, 2] // 7 + 295 = 302
        [6, 1, 7] | [9, 5]    || [7, 1, 2] // 617 + 95 = 712
        [6, 1, 7] | [5]       || [6, 2, 2] // 617 + 5 = 622

    }
}
