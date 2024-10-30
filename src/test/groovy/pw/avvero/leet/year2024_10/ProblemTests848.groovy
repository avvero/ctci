package pw.avvero.leet.year2024_10


import spock.lang.Specification
import spock.lang.Unroll

class ProblemTests848 extends Specification {

    @Unroll
    def "test"() {
        expect:
        new Problem848().shiftingLetters(s, shifts as int[]) == result
        where:
        s     | shifts       || result
        "bad" | [10, 20, 1]  || "gve"
        "bad" | [10, 20, 30] || "jyh"
        "abc" | [3, 5, 9]    || "rpl"

    }

}
