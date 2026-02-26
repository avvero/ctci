package pw.avvero.leet.year2026_02

import pw.avvero.leet.year2025.year2025_02.Problem306
import pw.avvero.leet.year2026_01.Problem677
import spock.lang.Specification
import spock.lang.Unroll

class ProblemTests688 extends Specification {

    @Unroll
    def "test"() {
        expect:
        new Problem688().knightProbability(1, 1, 0, 0) == 0.00000f
        new Problem688().knightProbability(3, 3, 0, 0) == 0.06250f
    }

}
