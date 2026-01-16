package pw.avvero.leet.year2026.year2025_08

import pw.avvero.leet.year2025.year2025_08.Problem539
import spock.lang.Specification
import spock.lang.Unroll

class ProblemTests539 extends Specification {

    @Unroll
    def "test"() {
        expect:
        new Problem539().findMinDifference(list) == result
        where:
        list               || result
        ["02:39", "21:43"] || 296
    }

}
