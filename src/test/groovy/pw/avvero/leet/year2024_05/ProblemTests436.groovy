package pw.avvero.leet.year2024_05


import spock.lang.Specification
import spock.lang.Unroll

class ProblemTests436 extends Specification {

    @Unroll
    def "test"() {
        expect:
        new Problem436().findRightInterval(intervals as int[][]) == result as int[]
        where:
        intervals                || result
        [[3, 4], [2, 3], [1, 2]] || [-1, 0, 1]
    }

}
