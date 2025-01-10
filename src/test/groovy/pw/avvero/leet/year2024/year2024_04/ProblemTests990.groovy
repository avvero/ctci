package pw.avvero.leet.year2024.year2024_04

import pw.avvero.leet.year2024.year2024_04.Problem990
import spock.lang.Specification
import spock.lang.Unroll

class ProblemTests990 extends Specification {

    @Unroll
    def "test"() {
        expect:
        new Problem990().equationsPossible(equations as String[]) == result
        where:
        equations        || result
        ["a==b", "b!=a"] || false
        ["b==a", "a==b"] || true
    }

}
