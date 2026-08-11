package pw.avvero.leet.year2026_02


import spock.lang.Specification
import spock.lang.Unroll

class ProblemTests846 extends Specification {

    @Unroll
    def "test"() {
        expect:
        new Problem846().isNStraightHand([1,2,3,6,2,3,4,7,8] as int[], 3) == true

    }

}
