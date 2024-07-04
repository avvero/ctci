package pw.avvero.leet.year2023.year2023_06

import pw.avvero.leet.year2023.year2023_06.Problem1318
import spock.lang.Specification
import spock.lang.Unroll

class Problem1318Tests extends Specification {

    @Unroll
    def "test"() {
        expect:
        new Problem1318().minFlips(a, b, c) == result
        where:
        a | b | c || result
        2 | 6 | 5 || 3
    }
}
