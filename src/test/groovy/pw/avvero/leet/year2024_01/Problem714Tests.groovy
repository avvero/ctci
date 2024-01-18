package pw.avvero.leet.year2024_01


import spock.lang.Specification
import spock.lang.Unroll

class Problem714Tests extends Specification {

    @Unroll
    def "test"() {
        expect:
        new Problem714().maxProfit(prices as int[], fee) == result
        where:
        prices              | fee || result
        [1, 3, 7, 5, 10, 3] | 3   || 6
        [1, 3, 2, 8, 4, 9]  | 2   || 8
    }

}
