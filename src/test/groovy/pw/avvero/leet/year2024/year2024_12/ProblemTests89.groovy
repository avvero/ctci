package pw.avvero.leet.year2024.year2024_12

import pw.avvero.leet.year2024.year2024_12.Problem89
import spock.lang.Specification
import spock.lang.Unroll

class ProblemTests89 extends Specification {

    @Unroll
    def "test"() {
        expect:
        new Problem89().grayCode(n) == result
        where:
        n || result
        4 || [0, 1, 3, 2, 6, 7, 5, 4, 12, 13, 15, 14, 10, 11, 9, 8]
        2 || [0, 1, 3, 2]
    }

}
