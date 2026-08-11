package pw.avvero.leet.year2026_02


import spock.lang.Specification
import spock.lang.Unroll

class ProblemTests738 extends Specification {

    @Unroll
    def "test"() {
        expect:
        new Problem738().monotoneIncreasingDigits(668841) == 667999
        new Problem738().monotoneIncreasingDigits(1234) == 1234
        new Problem738().monotoneIncreasingDigits(10) == 9

    }

}
