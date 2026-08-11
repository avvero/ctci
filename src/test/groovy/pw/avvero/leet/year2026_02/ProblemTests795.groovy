package pw.avvero.leet.year2026_02


import spock.lang.Specification
import spock.lang.Unroll

class ProblemTests795 extends Specification {

    @Unroll
    def "test"() {
        expect:
        new Problem795().numSubarrayBoundedMax([2,9,2,5,6] as int[], 2, 8) == 7
        new Problem795().numSubarrayBoundedMax([2,1,4,3] as int[], 2, 3) == 3

    }

}
