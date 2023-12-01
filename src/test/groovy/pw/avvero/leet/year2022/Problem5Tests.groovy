package pw.avvero.leet.year2022


import spock.lang.Specification
import spock.lang.Unroll

class Problem5Tests extends Specification {

    @Unroll
    def "test"() {
        expect:
        new Problem5().longestPalindrome(s) == result
        where:
        s                                          || result
        "aaaabbbbccccbbbbaaaaaaaabbbbccccbbbbaaaa" || "aaaabbbbccccbbbbaaaaaaaabbbbccccbbbbaaaa"
        "aabbccbbaaaabbccbbaa"                     || "aabbccbbaaaabbccbbaa"
        "ababababababa"                            || "ababababababa"
        "aaaa"                                     || "aaaa"
        "babab"                                    || "babab"
        "cbbd"                                     || "bb"
        "babad"                                    || "bab"
        "dfsdfsdasdfdsafghfghfg"                   || "asdfdsa"
        "dfsdfsdasdfdsafghfghfg"                   || "asdfdsa"
    }

}
