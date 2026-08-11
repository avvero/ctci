package pw.avvero.leet.year2026_02


import spock.lang.Specification
import spock.lang.Unroll

class ProblemTests838 extends Specification {

    @Unroll
    def "test"() {
        expect:
        new Problem838().pushDominoes(".L.R...LR..L..") == "LL.RR.LLRRLL.."
        new Problem838().pushDominoes("RR.L") == "RR.L"

    }

}
