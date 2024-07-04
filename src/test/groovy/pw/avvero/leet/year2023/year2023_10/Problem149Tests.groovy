package pw.avvero.leet.year2023.year2023_10

import pw.avvero.leet.year2023.year2023_10.Problem149
import spock.lang.Specification
import spock.lang.Unroll

class Problem149Tests extends Specification {

    @Unroll
    def "test1"() {
        expect:
        new Problem149().maxPoints(points as int[][]) == result
        where:
        points                                           | result
        [[1, 1], [3, 2], [5, 3], [4, 1], [2, 3], [1, 4]] | 4
        [[1, 1], [2, 2], [3, 3]]                         | 3
        [[-6, -1], [3, 1], [12, 3]]                      | 3
    }

    def gdc(a, b) {
        if (b == 0) return a
        return gdc(b, a % b)
    }

    @Unroll
    def "gdc"() {
        expect:
        gdc(a, b) == result
        where:
        a | b || result
        3 | 6 || 3
        6 | 3 || 3
        2 | 6 || 2
        6 | 2 || 2
        0 | 0 || 0
    }
}
