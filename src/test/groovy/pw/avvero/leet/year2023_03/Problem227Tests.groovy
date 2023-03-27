package pw.avvero.leet.year2023_03

import spock.lang.Specification
import spock.lang.Unroll

class Problem227Tests extends Specification {

    @Unroll
    def "test"() {
        expect:
        new Problem227().calculate(operation) == result
        where:
        operation || result
//        "3+2*2"   || 7
        "3*2*2+2" || 14
    }
}
