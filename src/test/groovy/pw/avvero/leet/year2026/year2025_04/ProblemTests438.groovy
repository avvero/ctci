package pw.avvero.leet.year2026.year2025_04

import pw.avvero.leet.year2025.year2025_04.Problem438
import spock.lang.Specification
import spock.lang.Unroll

class ProblemTests438 extends Specification {

    @Unroll
    def "test"() {
        expect:
        new Problem438().findAnagrams(s, p) == result
        where:
        s            | p     || result
        "cbaebabacd" | "abc" || [0, 6]
    }

}
