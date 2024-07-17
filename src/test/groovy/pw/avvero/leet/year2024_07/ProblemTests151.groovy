package pw.avvero.leet.year2024_07


import spock.lang.Specification
import spock.lang.Unroll

class ProblemTests151 extends Specification {

    @Unroll
    def "test"() {
        expect:
        new Problem151().reverseWords(source) == result
        where:
        source            || result
        "the sky is blue" || "blue is sky the"

    }

}
