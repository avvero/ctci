package pw.avvero.leet

import spock.lang.Specification
import spock.lang.Unroll

class Problem8Tests extends Specification {

    @Unroll
    def "test"() {
        expect:
        new Problem8().myAtoi(s) == result
        where:
        s                 || result
//        "42"              || 42
//        "   -42"          || -42
//        "4193 with words" || 4193
        "2147483648"      || 2147483647
//        "-6147483648"      || -2147483648
    }

}
