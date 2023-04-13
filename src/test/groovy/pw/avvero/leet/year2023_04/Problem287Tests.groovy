package pw.avvero.leet.year2023_04


import spock.lang.Specification
import spock.lang.Unroll

class Problem287Tests extends Specification {

    @Unroll
    def "test"() {
        expect:
        new Problem287().findDuplicate(nums as int[]) == result
        where:
        nums            || result
//        [1, 3, 4, 2, 2] || 2
        [3, 1, 3, 4, 2] || 3
    }
}
