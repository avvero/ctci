package pw.avvero.leet.year2024_01


import spock.lang.Specification
import spock.lang.Unroll

class Problem309Tests extends Specification {

    @Unroll
    def "test"() {
        expect:
        new Problem309().maxProfit(prices as int []) == result
        where:
        prices          || result
        [1, 2, 3, 0, 2] || 3
    }

}
