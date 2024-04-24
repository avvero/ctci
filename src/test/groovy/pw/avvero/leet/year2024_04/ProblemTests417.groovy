package pw.avvero.leet.year2024_04


import spock.lang.Specification
import spock.lang.Unroll

class ProblemTests417 extends Specification {

    @Unroll
    def "test"() {
        expect:
        new Problem417().pacificAtlantic(heights as int[][]) == result
        where:
        heights                                                                               || result
        [[1, 1, 1, 1, 1], [1, 1, 1, 1, 1], [1, 1, 1, 1, 1], [1, 1, 1, 1, 1], [1, 1, 1, 1, 1]] || [[0, 4], [1, 3], [1, 4], [2, 2], [3, 0], [3, 1], [4, 0]]
        [[1, 2, 2, 3, 5], [3, 2, 3, 4, 4], [2, 4, 5, 3, 1], [6, 7, 1, 4, 5], [5, 1, 1, 2, 4]] || [[0, 4], [1, 3], [1, 4], [2, 2], [3, 0], [3, 1], [4, 0]]
    }

}
