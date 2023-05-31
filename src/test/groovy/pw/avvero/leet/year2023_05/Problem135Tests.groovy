package pw.avvero.leet.year2023_05


import spock.lang.Specification
import spock.lang.Unroll

class Problem135Tests extends Specification {

    @Unroll
    def "test"() {
        expect:
        new Problem135().candy(ratings as int[]) == result
        where:
        ratings         || result
        [1, 3, 2, 2, 1] || 7
        [1, 0, 2]       || 5
        [1, 2, 2]       || 4
        [0, 1, 2]       || 6
    }
}
