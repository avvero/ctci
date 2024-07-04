package pw.avvero.leet.year2023.year2023_09

import pw.avvero.leet.year2023.year2023_09.Problem373
import spock.lang.Specification
import spock.lang.Unroll

class Problem373Tests extends Specification {

    @Unroll
    def "test1"() {
        expect:
        new Problem373().kSmallestPairs(nums1 as int[], nums2 as int[], k) == result
        where:
        nums1              | nums2                | k  || result
        [-10, -4, 0, 0, 6] | [3, 5, 6, 7, 8, 100] | 10 || [[-10, 3], [-10, 5], [-10, 6], [-10, 7], [-10, 8], [-4, 3], [-4, 5], [-4, 6], [0, 3], [0, 3]]
        [1, 2, 4, 5, 6]    | [3, 5, 7, 9]         | 3  || [[1, 3], [2, 3], [1, 5]]
        [1, 1, 2]          | [1, 2, 3]            | 10 || [[1, 1], [1, 1], [1, 2], [2, 1], [1, 2], [1, 3], [1, 3], [2, 2], [2, 3]]
        [1, 2]             | [3]                  | 3  || [[1, 3], [2, 3]]
    }


}
