package pw.avvero.leet.year2025_06


import spock.lang.Specification
import spock.lang.Unroll

class ProblemTests494 extends Specification {

    @Unroll
    def "test"() {
        expect:
        new Problem494().findTargetSumWays(nums as int[], target) == result
        where:
        nums      | target || result
        [1, 1, 1] | 2      || 0
    }

}
