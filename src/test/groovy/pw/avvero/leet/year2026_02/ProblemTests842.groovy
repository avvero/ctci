package pw.avvero.leet.year2026_02


import spock.lang.Specification
import spock.lang.Unroll

class ProblemTests842 extends Specification {

    @Unroll
    def "test"() {
        expect:
        new Problem842().splitIntoFibonacci("1101111") == [11, 0, 11, 11]

    }

}
