package pw.avvero.leet.year2025_09


import spock.lang.Specification
import spock.lang.Unroll

class ProblemTests592 extends Specification {

    @Unroll
    def "test"() {
        expect:
        new Problem592().fractionAddition(expression) == result
        where:
        expression      || result
        "-5/2+10/3+7/9" || "29/18"
        "7/2+2/3-3/4"   || "41/12"
        "1/3-1/2"       || "-1/6"
        "-1/2+1/2"      || "0/1"
        "-1/2+1/2+1/3"  || "1/3"
    }

}
