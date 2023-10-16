package pw.avvero.leet.year2023_10


import spock.lang.Specification
import spock.lang.Unroll

class Problem64Tests extends Specification {

    @Unroll
    def "test1"() {
        expect:
        new Problem64().minPathSum(grid as int[][]) == result
        where:
        grid                              | result
        [[1, 3, 1], [1, 5, 1], [4, 2, 1]] | 7
        [[1, 2, 3], [4, 5, 6]]            | 12
    }
}
