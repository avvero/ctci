package pw.avvero.leet.year2023_06


import spock.lang.Specification
import spock.lang.Unroll

class Problem30Tests extends Specification {

    @Unroll
    def "test"() {
        expect:
        new Problem30().findSubstring(s, words as String[]) == result
        where:
        s                                                  | words                                    || result
        "ababaab"                                          | ["ab", "ba", "ba"]                       || []
        "aaa"                                              | ["aa", "aa"]                             || []
        "wordgoodgoodgoodbestword"                         | ["word", "good", "best", "good"]         || [8]
        "lingmindraboofooowingdingbarrwingmonkeypoundcake" | ["fooo", "barr", "wing", "ding", "wing"] || [13]
        "barfoothefoobarman"                               | ["foo", "bar"]                           || [0, 9]
    }
}
