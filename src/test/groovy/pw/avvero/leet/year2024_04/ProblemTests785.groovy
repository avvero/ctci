package pw.avvero.leet.year2024_04


import spock.lang.Specification
import spock.lang.Unroll

class ProblemTests785 extends Specification {

    @Unroll
    def "test"() {
        expect:
        new Problem785().isBipartite(graph as int[][]) == result
        where:
        graph                                                                                                                        || result
        [[], [2, 4, 6], [1, 4, 8, 9], [7, 8], [1, 2, 8, 9], [6, 9], [1, 5, 7, 8, 9], [3, 6, 9], [2, 3, 4, 6, 9], [2, 4, 5, 6, 7, 8]] || false
    }

}
