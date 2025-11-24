package pw.avvero.leet.year2025_07

import pw.avvero.leet.year2025_06.Problem494
import spock.lang.Specification
import spock.lang.Unroll

class ProblemTests526 extends Specification {

    @Unroll
    def "test"() {
        expect:
        new Problem526().countArrangement(n) == result
        where:
        n || result
        2 || 2
    }

}
