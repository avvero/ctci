package pw.avvero.leet.year2023.year2023_04

import pw.avvero.leet.year2023.year2023_04.Problem242
import spock.lang.Specification
import spock.lang.Unroll

class Problem242Tests extends Specification {

    @Unroll
    def "test"() {
        expect:
        new Problem242().isAnagram(s, t) == result
        where:
        s         | t         || result
//        "anagram" | "nagaram" || true
        "rat"     | "car"     || false
    }
}
