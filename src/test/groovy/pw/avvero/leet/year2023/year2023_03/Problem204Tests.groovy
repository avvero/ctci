package pw.avvero.leet.year2023.year2023_03

import pw.avvero.leet.year2023.year2023_03.Problem204
import spock.lang.Specification
import spock.lang.Unroll

class Problem204Tests extends Specification {

    @Unroll
    def "test"() {
        expect:
        new Problem204().countPrimes(n) == result
        where:
        n      || result
//        10     || 4
//        0      || 0
//        1      || 0
        499979 || 499979
    }
}
