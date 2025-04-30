package pw.avvero.leet.year2025_04


import spock.lang.Specification
import spock.lang.Unroll

class ProblemTests447 extends Specification {

    @Unroll
    def "test"() {
        expect:
        new Problem447().numberOfBoomerangs(points as int[][]) == result
        where:
        points                   || result
        [[1, 1], [2, 2], [3, 3]] || 2
    }

}
