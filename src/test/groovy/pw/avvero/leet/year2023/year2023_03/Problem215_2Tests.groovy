package pw.avvero.leet.year2023.year2023_03

import pw.avvero.leet.year2023.year2023_03.Problem215_2
import spock.lang.Specification
import spock.lang.Unroll

class Problem215_2Tests extends Specification {

    @Unroll
    def "test"() {
        expect:
        new Problem215_2().findKthLargest(nums as int[], k) == result
        where:
        nums                        | k || result
//        [3, 2, 1, 5, 6, 4]          | 2 || 5
        [3, 2, 3, 1, 2, 4, 5, 5, 6] | 4 || 4
    }
}
