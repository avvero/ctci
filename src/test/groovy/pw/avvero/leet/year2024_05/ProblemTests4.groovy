package pw.avvero.leet.year2024_05


import spock.lang.Specification
import spock.lang.Unroll

class ProblemTests4 extends Specification {

    @Unroll
    def "test"() {
        expect:
        new Problem4().findMedianSortedArrays(nums1 as int[], nums2 as int[]) == result
        where:
        nums1        | nums2        || result
        [1, 3, 5, 7] | [2, 4, 6]    || 4
        [1, 3]       | [2]          || 2
        [1, 2]       | [3, 4]       || 2.5
        [1, 2, 3, 4] | [5, 6, 7, 8] || 4.5
        [5, 6, 7, 8] | [1, 2, 3, 4] || 4.5
        [1, 2, 3, 4] | [5]          || 3
    }

}
