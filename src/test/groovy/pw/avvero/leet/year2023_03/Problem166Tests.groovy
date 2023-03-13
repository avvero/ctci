package pw.avvero.leet.year2023_03

import spock.lang.Specification
import spock.lang.Unroll

class Problem166Tests extends Specification {

    @Unroll
    def "test"() {
        when:
        expect:
        new Problem166().fractionToDecimal(numerator, denominator) == result
        where:
        numerator | denominator || result
//        1         | 6           || "0.1(6)"
        89        | 270         || "0.3(296)"
    }
}
