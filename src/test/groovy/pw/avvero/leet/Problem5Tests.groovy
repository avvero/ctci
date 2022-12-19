package pw.avvero.leet

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
