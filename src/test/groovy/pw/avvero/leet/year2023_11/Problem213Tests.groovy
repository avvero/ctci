package pw.avvero.leet.year2023_11


import spock.lang.Specification
import spock.lang.Unroll

class Problem213Tests extends Specification {

    @Unroll
    def "test1"() {
        expect:
        new Problem213().rob(nums as int[]) == result
        where:
        nums              || result
        [1, 3, 1, 3, 100] || 103
    }
}
