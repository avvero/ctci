package pw.avvero.leet.year2025_03


import spock.lang.Specification
import spock.lang.Unroll

class ProblemTests402 extends Specification {

    @Unroll
    def "test"() {
        expect:
        new Problem402().removeKdigits(num, n) == result
        where:
        num       | n || result
        "1432219" | 3 || "1219"
    }

}
