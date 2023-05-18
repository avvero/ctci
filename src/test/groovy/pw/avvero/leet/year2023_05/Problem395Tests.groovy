package pw.avvero.leet.year2023_05


import spock.lang.Specification
import spock.lang.Unroll

class Problem395Tests extends Specification {

    @Unroll
    def "test"() {
        expect:
        new Problem395().longestSubstring(s, k) == n
        where:
        s          | k || n
        "baaabcb"  | 3 || 3
        "bbaaacbd" | 3 || 3
    }
}
