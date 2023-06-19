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
        "adobecodebancbbcaa"   | "abc"   || "bca"
        "aaabbaaba"            | "abbb"  || "bbaab"
        "aabaabaaab"           | "bb"    || "baab"
        "ab"                   | "b"     || "b"
        "ab"                   | "a"     || "a"
        "a"                    | "a"     || "a"
        "aaaaaaaaaaaabbbbbcdd" | "abcdd" || "abbbbbcdd"
        "ADOBECODEBANC"        | "ABC"   || "BANC"
        "cabwefgewcwaefgcf"    | "cae"   || "cwae"
        "a"                    | "aa"    || ""
    }
}
