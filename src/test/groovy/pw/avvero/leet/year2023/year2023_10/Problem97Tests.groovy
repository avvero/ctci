package pw.avvero.leet.year2023.year2023_10

import pw.avvero.leet.year2023.year2023_10.Problem97
import spock.lang.Specification
import spock.lang.Unroll

class Problem97Tests extends Specification {

    @Unroll
    def "test1"() {
        expect:
        new Problem97().isInterleave(s1, s2, s3) == result
        where:
        s1      | s2      | s3           || result
        "aabcc" | "dbbca" | "aadbbcbcac" || true
    }
}
