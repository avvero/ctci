package pw.avvero.leet

import spock.lang.Specification
import spock.lang.Unroll

class Problem139Tests extends Specification {

    @Unroll
    def "test"() {
        expect:
        new Problem139().wordBreak(str, dict) == result
        where:
        str                                               | dict                                                            || result
//        "leetcode"                                        | ["leet", "code"]                                                || true
//        "catskicatcats"                                   | ["cats", "cat", "dog", "ski"]                                   || true
//        "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" +
//                "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" +
//                "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" +
//                "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaab"        | ["a", "aa", "aaa", "aaaa", "aaaaa", "aaaaaa",
//                                                             "aaaaaaa", "aaaaaaaa", "aaaaaaaaa", "aaaaaaaaaa"]              || false

        "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" +
                "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaabaabaaa" +
                "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" +
                "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"        | ["aa", "aaa", "aaaa", "aaaaa", "aaaaaa", "aaaaaaa", "aaaaaaaa",
                                                             "aaaaaaaaa", "aaaaaaaaaa", "ba"]                               || true
    }

}
