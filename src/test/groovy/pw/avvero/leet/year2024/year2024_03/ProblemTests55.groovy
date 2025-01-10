package pw.avvero.leet.year2024.year2024_03

import pw.avvero.leet.year2024.year2024_03.Problem55
import spock.lang.Specification
import spock.lang.Unroll

class ProblemTests55 extends Specification {

    @Unroll
    def "test"() {
        expect:
        new Problem55().canJump(nums as int[]) == result
        where:
        nums            || result
        [3, 2, 1, 0, 4] || false
        [1, 0, 1, 0]    || false
        [3, 2, 1, 0, 4] || false
        [2, 3, 1, 1, 4] || true
    }

}
