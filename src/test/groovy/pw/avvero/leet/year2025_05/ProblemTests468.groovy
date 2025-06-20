package pw.avvero.leet.year2025_05


import spock.lang.Specification
import spock.lang.Unroll

class ProblemTests468 extends Specification {

    @Unroll
    def "test"() {
        expect:
        new Problem468().validIPAddress(value) == result
        where:
        value                                || result
        "2001:0db8:85a3:0:0:8A2E:0370:7334:" || "Neither"
        "172.16.254.1"                       || "IPv4"
    }

}
