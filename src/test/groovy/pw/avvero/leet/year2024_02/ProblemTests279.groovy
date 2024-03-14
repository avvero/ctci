package pw.avvero.leet.year2024_02


import spock.lang.Specification
import spock.lang.Unroll

class ProblemTests279 extends Specification {

    @Unroll
    def "test"() {
        expect:
        new Problem279().numSquares(n) == result
        where:
        n  || result
        16 || 1
    }

}
