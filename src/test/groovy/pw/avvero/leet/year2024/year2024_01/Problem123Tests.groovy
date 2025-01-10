package pw.avvero.leet.year2024.year2024_01

import pw.avvero.leet.year2024.year2024_01.Problem123
import spock.lang.Specification
import spock.lang.Unroll

class Problem123Tests extends Specification {

    @Unroll
    def "test"() {
        expect:
        new Problem123().maxProfit(prices as int[]) == result
        where:
        prices                   || result
        [3, 3, 5, 0, 0, 3, 1, 4] || 6
    }

}
