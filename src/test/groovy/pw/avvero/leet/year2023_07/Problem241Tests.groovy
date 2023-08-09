package pw.avvero.leet.year2023_07


import spock.lang.Specification
import spock.lang.Unroll

class Problem241Tests extends Specification {

    @Unroll
    def "test"() {
        expect:
        new Problem241().diffWaysToCompute(exp) == [0, 2]
        where:
        exp       | result
        "2-1-1"   | [0, 2]
        "2*3-4*5" | [-34, -14, -10, -10, 10]
    }
}
