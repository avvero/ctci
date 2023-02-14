package pw.avvero.leet


import spock.lang.Specification
import spock.lang.Unroll

class Problem121Tests extends Specification {

    @Unroll
    def "test"() {
        expect:
        new Problem121().maxProfit(prices as int[]) == result
        where:
        prices             || result
//        [7, 1, 5, 3, 6, 4] || 5
//        [7, 6, 4, 3, 1]    || 0
        [1,2]    || 1
    }

}
