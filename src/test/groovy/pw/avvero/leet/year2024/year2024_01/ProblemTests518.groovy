package pw.avvero.leet.year2024.year2024_01

import pw.avvero.leet.year2024.year2024_01.Problem518
import spock.lang.Specification
import spock.lang.Unroll

class ProblemTests518 extends Specification {

    @Unroll
    def "test"() {
        expect:
        new Problem518().change(amount, coins as int[]) == result
        where:
        amount | coins     || result
//        3      | [2]       || 0
        5      | [1, 2, 5] || 4
    }

}
