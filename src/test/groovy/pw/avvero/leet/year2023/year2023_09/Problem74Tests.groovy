package pw.avvero.leet.year2023.year2023_09

import pw.avvero.leet.year2023.year2023_09.Problem74
import spock.lang.Specification
import spock.lang.Unroll

class Problem74Tests extends Specification {

    @Unroll
    def "test1"() {
        expect:
        new Problem74().searchMatrix(matrix as int[][], target) == result
        where:
        matrix             | target | result
        [[1, 1]]           | 0      | false
        [[1, 3, 5, 7],
         [10, 11, 16, 20],
         [23, 30, 34, 60]] | 13     | false
        [[1, 3, 5, 7],
         [10, 11, 16, 20],
         [23, 30, 34, 60]] | 3      | true
        [[1], [3]]         | 2      | false
        [[1, 3, 5, 7],
         [10, 11, 16, 20],
         [23, 30, 34, 50]] | 11     | true
    }

}
