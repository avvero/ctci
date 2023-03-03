package pw.avvero.leet.year2022

import pw.avvero.leet.year2022.Problem6
import spock.lang.Specification
import spock.lang.Unroll

class Problem6Tests extends Specification {

    @Unroll
    def "test"() {
        expect:
        new Problem6().convert(s, n) == result
        where:
        s                | n || result
//        "PAYPALISHIRING" | 3 || "PAHNAPLSIIGYIR"
//        "PAYPALISHIRING" | 4 || "PINALSIGYAHRPI"
        "ABCDE"          | 4 || "ABCED"
    }

}
