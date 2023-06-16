package pw.avvero.leet.year2023_06


import spock.lang.Specification
import spock.lang.Unroll

class Problem76Tests extends Specification {

    @Unroll
    def "test"() {
        expect:
        new Problem76().minWindow(s, t) == result
        where:
        s                      | t       || result
        "aaaaaaaaaaaabbbbbcdd" | "abcdd" || "abbbbbcdd"
        "cabwefgewcwaefgcf"    | "cae"   || "cwae"
        "ADOBECODEBANC"        | "ABC"   || "BANC"
        "a"                    | "a"     || "a"
        "a"                    | "aa"    || ""
    }
}
