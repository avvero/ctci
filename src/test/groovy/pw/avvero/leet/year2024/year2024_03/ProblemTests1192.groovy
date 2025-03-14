package pw.avvero.leet.year2024.year2024_03

import pw.avvero.leet.year2024.year2024_03.Problem1192
import spock.lang.Specification
import spock.lang.Unroll

class ProblemTests1192 extends Specification {

    @Unroll
    def "test"() {
        expect:
        new Problem1192().criticalConnections(n, connections) == result
        where:
        n | connections                                              || result
        6 | [[0, 1], [1, 2], [2, 0], [1, 3], [3, 4], [4, 5], [5, 3]] || [[1, 3]]
        4 | [[0, 1], [1, 2], [2, 0], [1, 3]]                         || [[1, 3]]
        2 | [[0, 1]]                                                 || [[0, 1]]
    }

}
