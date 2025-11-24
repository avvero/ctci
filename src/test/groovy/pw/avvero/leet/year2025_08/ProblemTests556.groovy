package pw.avvero.leet.year2025_08


import spock.lang.Specification
import spock.lang.Unroll

class ProblemTests556 extends Specification {

    @Unroll
    def "test"() {
        expect:
        new Problem556().nextGreaterElement(n) == result
        where:
        n          || result
        2147483476 || 2147483647
    }

}
