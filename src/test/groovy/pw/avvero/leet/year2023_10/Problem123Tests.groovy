package pw.avvero.leet.year2023_10


import spock.lang.Specification
import spock.lang.Unroll

class Problem123Tests extends Specification {

    @Unroll
    def "test1"() {
        expect:
        new Problem123().maxProfit(prices as int[]) == result
        where:
        prices                   || result
        [3, 3, 5, 0, 0, 3, 1, 4] || 6
//        [3, 3, 5, 1, 1, 3, 1, 4] || 5
    }
}
