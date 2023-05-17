package pw.avvero.leet.year2023_05


import spock.lang.Specification
import spock.lang.Unroll

class Problem378Tests extends Specification {

    @Unroll
    def "test"() {
        expect:
        new Problem378().kthSmallest(matrix as int[][], k) == result
        where:
        matrix                                  | k || result
//        [[1, 5, 9], [10, 11, 13], [12, 13, 15]] | 8 || 13
        [[1, 4, 7], [2, 5, 8], [3, 6, 9]]       | 8 || 8
    }
}
