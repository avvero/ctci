package pw.avvero.leet.year2023_12


import spock.lang.Specification
import spock.lang.Unroll

class Problem516Tests extends Specification {

    @Unroll
    def "test"() {
        expect:
        new Problem516().longestPalindromeSubseq(s) == result
        where:
        s        || result
        "bbbab"  || 4
        "abcdba" || 5

    }

}
