package pw.avvero.leet.year2023.year2023_03

import pw.avvero.leet.year2023.year2023_03.Problem166
import spock.lang.Specification
import spock.lang.Unroll

class Problem166Tests extends Specification {

    @Unroll
    def "test"() {
        expect:
        new Problem166().fractionToDecimal(numerator, denominator) == result
        where:
        numerator | denominator || result
//        1         | 6           || "0.1(6)"
//        89        | 270         || "0.3(296)"
        -1        | 270         || "0.3(296)"
        -1        | -2147483648 || "0.0000000004656612873077392578125"
    }
}
