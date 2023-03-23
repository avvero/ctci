package pw.avvero.leet.year2023_03

import spock.lang.Specification
import spock.lang.Unroll

class Problem215Tests extends Specification {

    @Unroll
    def "test"() {
        expect:
        new Problem215().findKthLargest(nums as int[], k) == result
        where:
        nums                  | k || result
        [7, 10, 4, 3, 20, 15] | 3 || 7
        [7, 10, 4, 3, 20, 15] | 4 || 10
        [3, 4, 5, 9, 8, 7]    | 2 || 4
    }
}
