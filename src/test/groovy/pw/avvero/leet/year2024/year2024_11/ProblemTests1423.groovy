package pw.avvero.leet.year2024.year2024_11

import pw.avvero.leet.year2024.year2024_11.Problem1423
import spock.lang.Specification
import spock.lang.Unroll

class ProblemTests1423 extends Specification {

    @Unroll
    def "test"() {
        expect:
        new Problem1423().maxScore(cards as int[], k) == result
        where:
        cards                 | k || result
        [1, 2, 3, 4, 5, 6, 1] | 3 || 12
    }

}
