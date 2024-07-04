package pw.avvero.leet.year2023.year2023_11

import pw.avvero.leet.year2023.year2023_11.Problem188
import spock.lang.Specification
import spock.lang.Unroll

class Problem188Tests extends Specification {

    @Unroll
    def "test1"() {
        expect:
        new Problem188().maxProfit(k, prices as int[]) == result
        where:
        k | prices             || result
        1 | [3, 2, 6, 5, 0, 3] || 4
        1 | [2, 4, 1]          || 2
        2 | [2, 4, 1]          || 2
        2 | [3, 2, 6, 5, 0, 3] || 7
    }
}
