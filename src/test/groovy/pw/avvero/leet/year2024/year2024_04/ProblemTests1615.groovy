package pw.avvero.leet.year2024.year2024_04

import pw.avvero.leet.year2024.year2024_04.Problem1615
import spock.lang.Specification
import spock.lang.Unroll

class ProblemTests1615 extends Specification {

    @Unroll
    def "test"() {
        expect:
        new Problem1615().maximalNetworkRank(n, roads as int[][]) == result
        where:
        n | roads                                            || result
        5 | [[0, 1], [0, 3], [1, 2], [1, 3], [2, 3], [2, 4]] || 5
    }

}
