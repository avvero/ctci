package pw.avvero.leet.year2024.year2024_05

import pw.avvero.leet.year2024.year2024_05.Problem34
import spock.lang.Specification
import spock.lang.Unroll

class ProblemTests34 extends Specification {

    @Unroll
    def "test"() {
        expect:
        new Problem34().searchRange(nums as int[], target) == result as int[]
        where:
        nums                | target || result
        [5, 7, 7, 8, 8, 10] | 8      || [3, 4]
    }

}
