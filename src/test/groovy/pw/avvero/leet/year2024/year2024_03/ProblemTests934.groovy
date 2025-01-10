package pw.avvero.leet.year2024.year2024_03

import pw.avvero.leet.year2024.year2024_03.Problem934
import spock.lang.Specification
import spock.lang.Unroll

class ProblemTests934 extends Specification {

    @Unroll
    def "test"() {
        expect:
        new Problem934().shortestBridge(grid as int[][]) == result
        where:
        grid                                                                                  || result
//        [[0, 1, 1], [0, 0, 0], [0, 0, 1]]                                                     || 2
        [[0, 1, 0], [0, 0, 0], [0, 0, 1]]                                                     || 2
        [[1, 1, 1, 1, 1], [1, 0, 0, 0, 1], [1, 0, 1, 0, 1], [1, 0, 0, 0, 1], [1, 1, 1, 1, 1]] || 1
        [[0, 1], [1, 0]]                                                                      || 1
    }

}
