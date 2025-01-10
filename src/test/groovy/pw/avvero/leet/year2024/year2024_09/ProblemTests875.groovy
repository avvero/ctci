package pw.avvero.leet.year2024.year2024_09

import pw.avvero.leet.year2024.year2024_09.Problem875
import spock.lang.Specification
import spock.lang.Unroll

class ProblemTests875 extends Specification {

    @Unroll
    def "test"() {
        expect:
        new Problem875().minEatingSpeed(piles as int[], hours) == result
        where:
        piles                | hours || result
        [1, 1, 1, 999999999] | 10    || 142857143
        [3, 6, 7, 11]        | 8     || 4

    }

}
