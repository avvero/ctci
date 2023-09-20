package pw.avvero.leet.year2023_09


import spock.lang.Specification
import spock.lang.Unroll

class Problem4Tests extends Specification {

    @Unroll
    def "test1"() {
        expect:
        new Problem4().findMedianSortedArrays(nums1 as int[], nums2 as int[]) == result
        where:
        nums1                                | nums2                             | result
        [1, 3]                               | [2]                               | 2
        [1, 2]                               | [3, 4]                            | 2.5
        [1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 4, 4] | [1, 3, 4, 4, 4, 4, 4, 4, 4, 4, 4] | 3
    }

}
