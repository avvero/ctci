package pw.avvero.leet.year2023.year2023_05

import pw.avvero.leet.year2023.year2023_05.Problem350
import spock.lang.Specification
import spock.lang.Unroll

class Problem350Tests extends Specification {

    @Unroll
    def "test"() {
        expect:
        new Problem350().intersect(nums1 as int[], nums2 as int[]) == result as int[]
        where:
        nums1     | nums2           || result
        [4, 9, 5] | [9, 4, 9, 8, 4] || [4, 9]
        [1]       | [1]             || [1]
    }
}
