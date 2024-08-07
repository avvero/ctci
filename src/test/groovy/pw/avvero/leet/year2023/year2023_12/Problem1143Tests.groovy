package pw.avvero.leet.year2023.year2023_12

import pw.avvero.leet.year2023.year2023_12.Problem1143
import spock.lang.Specification
import spock.lang.Unroll

class Problem1143Tests extends Specification {

    @Unroll
    def "test"() {
        expect:
        new Problem1143().longestCommonSubsequence(text1, text2) == result
        where:
        text1      | text2       || result
        "bsbininm" | "jmjkbkjkv" || 1
    }

}
