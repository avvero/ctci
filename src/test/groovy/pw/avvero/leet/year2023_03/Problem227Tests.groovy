package pw.avvero.leet.year2023_03

import spock.lang.Specification
import spock.lang.Unroll

class Problem227Tests extends Specification {

    @Unroll
    def "test"() {
        expect:
        new Problem227_2().calculate(operation) == result
        where:
        operation   || result
        "3+2*2"     || 7
        "3*2+2"     || 8
        "3*2*2+2"   || 14
        " 3/2 "     || 1
        " 3+5 / 2 " || 5
        "42"        || 42
        "1-1+1"     || 1
        "2+3-4"     || 1
    }
}
