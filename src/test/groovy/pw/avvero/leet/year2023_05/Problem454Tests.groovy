package pw.avvero.leet.year2023_05


import spock.lang.Specification
import spock.lang.Unroll

class Problem454Tests extends Specification {

    @Unroll
    def "test"() {
        expect:
        new Problem454().fourSumCount(nums1 as int[], nums2 as int[], nums3 as int[], nums4 as int[]) == n
        where:
        nums1      | nums2      | nums3     | nums4      || n
        [0, 1, -1] | [-1, 1, 0] | [0, 0, 1] | [-1, 1, 1] || 17
    }
}
