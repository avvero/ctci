package pw.avvero.leet.year2024.year2024_01

import pw.avvero.leet.year2024.year2024_01.Problem188
import spock.lang.Specification
import spock.lang.Unroll

class ProblemTests188 extends Specification {

    @Unroll
    def "test"() {
        expect:
        new Problem188().maxProfit(k, prices as int[]) == result
        where:
        k | prices    || result
        2 | [1, 2, 4] || 3
        2 | [2, 4, 1] || 2
        1 | [2, 4, 1] || 2
    }

}
