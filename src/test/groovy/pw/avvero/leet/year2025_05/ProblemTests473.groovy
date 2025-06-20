package pw.avvero.leet.year2025_05


import spock.lang.Specification
import spock.lang.Unroll

class ProblemTests473 extends Specification {

    @Unroll
    def "test"() {
        expect:
        new Problem473().makesquare(matchsticks as int[]) == result
        where:
        matchsticks                          || result
        [1, 1, 2, 2, 2]                      || true
        [5, 5, 5, 5, 4, 4, 4, 4, 3, 3, 3, 3] || true
        [3, 3, 3, 3, 4]                      || false
    }

}
