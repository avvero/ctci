package pw.avvero.leet.year2023_04


import spock.lang.Specification
import spock.lang.Unroll

class Problem347Tests extends Specification {

    @Unroll
    def "test"() {
        expect:
        new Problem347().topKFrequent(nums as int[], k) == result as int[]
        where:
        nums                                                                                | k  || result
        [3, 2, 3, 1, 2, 4, 5, 5, 6, 7, 7, 8, 2, 3, 1, 1, 1, 10, 11, 5, 6, 2, 4, 7, 8, 5, 6] | 10 || [1, 2, 5, 3, 6, 7, 4, 8, 10, 11]
        [1, 1, 1, 2, 2, 3]                                                                  | 2  || [1, 2]

    }
}
