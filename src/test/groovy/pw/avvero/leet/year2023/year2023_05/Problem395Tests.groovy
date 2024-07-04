package pw.avvero.leet.year2023.year2023_05

import pw.avvero.leet.year2023.year2023_05.Problem395
import spock.lang.Specification
import spock.lang.Unroll

class Problem395Tests extends Specification {

    @Unroll
    def "test"() {
        expect:
        new Problem395().longestSubstring(s, k) == n
        where:
        s          | k || n
        "a"        | 1 || 1
        "aa"       | 1 || 2
        "aa"       | 2 || 2
        "ab"       | 1 || 2
        "ab"       | 2 || 0
        "baaabcb"  | 3 || 3
        "bbaaacbd" | 3 || 3
    }
}
