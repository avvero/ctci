package pw.avvero.leet.year2024.year2024_11

import pw.avvero.leet.year2024.year2024_11.Problem1140
import spock.lang.Specification
import spock.lang.Unroll

class ProblemTests1140 extends Specification {

    @Unroll
    def "test"() {
        expect:
        new Problem1140().stoneGameII(piles as int[]) == result
        where:
        piles           || result
        [2, 7, 9, 4, 4] || 10
    }

}
