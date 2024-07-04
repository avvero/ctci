package pw.avvero.leet.year2023.year2023_04

import pw.avvero.leet.year2023.year2023_04.Problem322
import spock.lang.Specification
import spock.lang.Unroll

class Problem322Tests extends Specification {

    @Unroll
    def "test"() {
        expect:
        new Problem322().coinChange(coins as int[], amount) == result
        where:
        coins               | amount || result
        [186, 419, 83, 408] | 6249   || 20
        [1, 2, 5]           | 11     || 3
    }
}
