package pw.avvero.leet.year2026.year2025_03

import pw.avvero.leet.year2025.year2025_03.Problem368
import spock.lang.Specification
import spock.lang.Unroll

class ProblemTests368 extends Specification {

    @Unroll
    def "test"() {
        expect:
        new Problem368().largestDivisibleSubset(nums as int[]) == result
        where:
        nums      || result
        [1, 2, 3] || [1, 2]
    }

}
