package pw.avvero.leet.year2026_02


import spock.lang.Specification
import spock.lang.Unroll

class ProblemTests811 extends Specification {

    @Unroll
    def "test"() {
        expect:
        new Problem811().numSubarrayBoundedMax([2,9,2,5,6] as int[], 2, 8) == 7

    }

}
