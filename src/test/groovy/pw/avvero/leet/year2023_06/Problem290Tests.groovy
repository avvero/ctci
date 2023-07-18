package pw.avvero.leet.year2023_06


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
