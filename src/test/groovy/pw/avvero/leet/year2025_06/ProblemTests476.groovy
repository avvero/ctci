package pw.avvero.leet.year2025_06


import spock.lang.Specification
import spock.lang.Unroll

class ProblemTests476 extends Specification {

    @Unroll
    def "test"() {
        expect:
        new Problem476().findComplement(num) == result
        where:
        num        || result
        2147483647 || 2
        5          || 2
    }

}
