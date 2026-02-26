package pw.avvero.leet.year2026_02


import spock.lang.Specification
import spock.lang.Unroll

class ProblemTests696 extends Specification {

    @Unroll
    def "test"() {
        expect:
        new Problem696().countBinarySubstrings("10101") == 4

    }

}
