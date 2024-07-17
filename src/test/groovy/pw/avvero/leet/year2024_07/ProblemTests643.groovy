package pw.avvero.leet.year2024_07


import spock.lang.Specification
import spock.lang.Unroll

class ProblemTests643 extends Specification {

    @Unroll
    def "test"() {
        expect:
        new Problem643().findMaxAverage(nums as int[], k) == result as double
        where:
        nums            | k || result
        [0, 4, 0, 3, 2] | 1 || 4.0

    }

}
