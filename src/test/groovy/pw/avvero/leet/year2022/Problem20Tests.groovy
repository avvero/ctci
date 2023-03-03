package pw.avvero.leet.year2022

import pw.avvero.leet.year2022.Problem20
import spock.lang.Specification
import spock.lang.Unroll

class Problem20Tests extends Specification {

    @Unroll
    def "test"() {
        expect:
        new Problem20().isValid(s) == result
        where:
        s        || result
        "(){}}{" || false
        "{[]}"   || true
        "([]"    || false
    }
}
