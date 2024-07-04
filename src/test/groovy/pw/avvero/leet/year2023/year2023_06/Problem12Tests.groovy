package pw.avvero.leet.year2023.year2023_06

import pw.avvero.leet.year2023.year2023_06.Problem12
import spock.lang.Specification
import spock.lang.Unroll

class Problem12Tests extends Specification {

    @Unroll
    def "test"() {
        expect:
        new Problem12().intToRoman(num) == result
        where:
        num  || result
        10   || "X"
        1994 || "MCMXCIV"
        3    || "III"
        58   || "LVIII"
    }
}
