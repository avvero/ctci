package pw.avvero.leet.year2023.year2023_03

import pw.avvero.leet.year2023.year2023_03.Problem190
import spock.lang.Specification
import spock.lang.Unroll

class Problem190Tests extends Specification {

    @Unroll
    def "test"() {
        expect:
        new Problem190().reverseBits(n) == result
        where:
        n  || result
        13 || 11
    }
}
