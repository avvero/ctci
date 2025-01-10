package pw.avvero.leet.year2024.year2024_07

import pw.avvero.leet.year2024.year2024_07.Problem1493
import spock.lang.Specification
import spock.lang.Unroll

class ProblemTests1493 extends Specification {

    @Unroll
    def "test"() {
        expect:
        new Problem1493().longestSubarray(nums as int[]) == result
        where:
        nums                        || result
        [0, 1, 1, 1, 0, 1, 1, 0, 1] || 5

    }

}
