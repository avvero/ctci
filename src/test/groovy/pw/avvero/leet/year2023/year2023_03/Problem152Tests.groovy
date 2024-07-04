package pw.avvero.leet.year2023.year2023_03

import pw.avvero.leet.year2023.year2023_03.Problem152
import spock.lang.Specification
import spock.lang.Unroll

class Problem152Tests extends Specification {

    @Unroll
    def "test #nums = #result"() {
        expect:
        new Problem152().maxProduct(nums as int[]) == result
        where:
        nums                          || result
        [2, 3, -2, 4]                 || 6
        [2, -5, -2, -4, 3]            || 24
        [-2, 0, -1]                   || 0
        [2, -5, -2, -4, 3, -1]        || 240
        [1, 0, -1, 2, 3, -5, -2]      || 60
        [-1, 1, 2, 1]                 || 2
        [-1, -2, -2, -2, 3, 2, -2, 0] || 96
    }
}
