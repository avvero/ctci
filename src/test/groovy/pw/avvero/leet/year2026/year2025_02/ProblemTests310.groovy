package pw.avvero.leet.year2026.year2025_02

import pw.avvero.leet.year2025.year2025_02.Problem310
import spock.lang.Specification
import spock.lang.Unroll

class ProblemTests310 extends Specification {

    @Unroll
    def "test"() {
        expect:
        new Problem310().findMinHeightTrees(n, edges as int[][]) == result
        where:
        n | edges                    || result
        4 | [[1, 0], [1, 2], [1, 3]] || [1]
    }

}
