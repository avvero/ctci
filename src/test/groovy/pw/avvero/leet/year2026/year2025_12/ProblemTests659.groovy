package pw.avvero.leet.year2026.year2025_12

import pw.avvero.leet.year2025.year2025_12.Problem659
import spock.lang.Specification
import spock.lang.Unroll

class ProblemTests659 extends Specification {

    @Unroll
    def "test"() {
        expect:
        new Problem659().isPossible(input as int[]) == result
        where:
        input              || result
        [1, 2, 3, 3, 4, 5] || true
    }

}
