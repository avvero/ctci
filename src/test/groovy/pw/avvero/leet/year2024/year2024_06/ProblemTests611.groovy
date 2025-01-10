package pw.avvero.leet.year2024.year2024_06

import pw.avvero.leet.year2024.year2024_06.Problem611
import spock.lang.Specification
import spock.lang.Unroll

class ProblemTests611 extends Specification {

    @Unroll
    def "test"() {
        expect:
        new Problem611().triangleNumber(nums as int[]) == result
        where:
        nums         || result
        [2, 2, 3, 4] || 3
        [4, 2, 3, 4] || 4

    }

}
