package pw.avvero.leet.year2026_02


import spock.lang.Specification
import spock.lang.Unroll

class ProblemTests698 extends Specification {

    @Unroll
    def "test"() {
        expect:
        new Problem698().canPartitionKSubsets([4,3,2,3,5,2,1] as int[], 4) == true

    }

}
