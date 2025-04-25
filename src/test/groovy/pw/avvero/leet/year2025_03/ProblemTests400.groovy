package pw.avvero.leet.year2025_03


import spock.lang.Specification
import spock.lang.Unroll

class ProblemTests400 extends Specification {

    @Unroll
    def "test"() {
        expect:
        new Problem400().findNthDigit(n) == result
        where:
        n  || result
//        3  || 3
        11 || 0
    }

}
