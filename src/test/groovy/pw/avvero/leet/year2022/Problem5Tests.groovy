package pw.avvero.leet.year2022

import pw.avvero.leet.year2022.Problem5
import spock.lang.Specification
import spock.lang.Unroll

class Problem5Tests extends Specification {

    @Unroll
    def "test"() {
        expect:
        new Problem5().longestPalindrome(s) == result
        where:
        s                        || result
//        "babad"                  || "bab"
//        "cbbd"                   || "bb"
        "dfsdfsdasdfdsafghfghfg" || "asdfdsa"
        "dfsdfsdasdfdsafghfghfg" || "asdfdsa"
    }

}
