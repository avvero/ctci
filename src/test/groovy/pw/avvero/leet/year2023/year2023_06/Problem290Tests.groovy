package pw.avvero.leet.year2023.year2023_06

import pw.avvero.leet.year2023.year2023_06.Problem290
import spock.lang.Specification
import spock.lang.Unroll

class Problem290Tests extends Specification {

    @Unroll
    def "test"() {
        expect:
        new Problem290().wordPattern(pattern, s) == result
        where:
        pattern | s                 || result
        "abba"  | "dog cat cat dog" || true
    }
}
