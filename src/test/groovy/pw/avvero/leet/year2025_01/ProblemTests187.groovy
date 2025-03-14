package pw.avvero.leet.year2025_01


import spock.lang.Specification
import spock.lang.Unroll

class ProblemTests187 extends Specification {

    @Unroll
    def "test"() {
        expect:
        new Problem187().findRepeatedDnaSequences(s) == result
        where:
        s                                  || result
        "AAAAACCCCCAAAAACCCCCCAAAAAGGGTTT" || ["AAAAACCCCC", "CCCCCAAAAA"]

    }

}
