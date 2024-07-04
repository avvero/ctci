package pw.avvero.leet.year2023.year2023_09

import pw.avvero.leet.year2023.year2023_09.Problem52
import spock.lang.Specification
import spock.lang.Unroll

class Problem52Tests extends Specification {

    @Unroll
    def "test1"() {
        expect:
        new Problem52().totalNQueens(n) == result
        where:
        n | result
        4 | 2
        1 | 1
    }

}
