package pw.avvero.leet.year2026_02


import spock.lang.Specification
import spock.lang.Unroll

class ProblemTests881 extends Specification {

    @Unroll
    def "test"() {
        when:
        def problem = new Problem881()
        then:
        problem.numRescueBoats([3,2,2,1] as int[], 3) == 3
    }
}
