package pw.avvero.leet.year2025_02


import spock.lang.Specification
import spock.lang.Unroll

class ProblemTests306 extends Specification {

    @Unroll
    def "test"() {
        expect:
        new Problem306().isAdditiveNumber(s) == result
        where:
        s                      || result
        "1023"                 || false
        "211738"               || true
        "11235813213455890144" || false
        "112358"               || true
//        "1023"      || false
        "101"                  || true
        "111"                  || false
        "199100199"            || true
    }

}
