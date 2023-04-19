package pw.avvero.leet.year2023_04


import spock.lang.Specification
import spock.lang.Unroll

class Problem322Tests extends Specification {

    @Unroll
    def "test"() {
        expect:
        new Problem322().coinChange(coins as int[], amount) == result
        where:
        coins               | amount || result
        [1, 2, 5]           | 11     || 3
        [186, 419, 83, 408] | 6249   || 20
    }
}
