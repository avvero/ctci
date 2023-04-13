package pw.avvero.leet.year2023_04


import spock.lang.Specification
import spock.lang.Unroll

class Problem300Tests extends Specification {

    @Unroll
    def "test"() {
        expect:
        new Problem300().lengthOfLIS(nums as int[]) == result
        where:
        nums                                      || result
        [10, 9, 2, 5, 3, 7, 101, 18]              || 4
        [0, 1, 0, 3, 2, 3]                        || 4
        [7, 7, 7, 7, 7, 7, 7]                     || 1
        [10, 9, 2, 5, 3, 7, 101, 1, 6, 18, 8, 11] || 4
    }
}
