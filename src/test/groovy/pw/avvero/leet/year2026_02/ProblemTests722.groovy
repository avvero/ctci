package pw.avvero.leet.year2026_02


import spock.lang.Specification
import spock.lang.Unroll

class ProblemTests722 extends Specification {

    @Unroll
    def "test"() {
        expect:
        new Problem722().removeComments(["a/*commentlinemore_comment*/b"] as String[]) == ["ab"]

    }

}
