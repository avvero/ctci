package pw.avvero.leet.year2023.year2023_11

import pw.avvero.leet.year2023.year2023_11.Problem264
import spock.lang.Specification
import spock.lang.Unroll

class Problem264Tests extends Specification {

    @Unroll
    def "test1"() {
        expect:
        new Problem264().nthUglyNumber(n) == result
        where:
        n  || result
        27 || 64
        1  || 1
    }
}
