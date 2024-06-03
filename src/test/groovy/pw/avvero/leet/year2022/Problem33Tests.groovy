package pw.avvero.leet.year2022


import spock.lang.Specification
import spock.lang.Unroll

class Problem33Tests extends Specification {

    @Unroll
    def "test"() {
        expect:
        new Problem33().search(nums as int[], target) == result
        where:
        nums                  | target || result
        [3, 1]                | 1      || 1
        [4, 5, 6, 7, 0, 1, 2] | 0      || 4
        [5, 1, 2, 3, 4]       | 1      || 1
    }

}
