package pw.avvero.leet.year2024.year2024_12

import pw.avvero.leet.year2024.year2024_12.Problem93
import spock.lang.Specification
import spock.lang.Unroll

class ProblemTests93 extends Specification {

    @Unroll
    def "test"() {
        expect:
        new Problem93().restoreIpAddresses(s) == result
        where:
        s      || result
        "0000" || ["0.0.0.0"]

    }

}
