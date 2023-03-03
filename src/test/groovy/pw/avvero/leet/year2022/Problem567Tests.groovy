package pw.avvero.leet.year2022

import pw.avvero.leet.year2022.Problem567
import spock.lang.Specification
import spock.lang.Unroll

class Problem567Tests extends Specification {

    @Unroll
    def "string #s1 is in #s2: result"() {
        expect:
        new Problem567().checkInclusion(s1, s2) == result
        where:
        s1           | s2                     || result
//        "adc"        | "dcda"                 || true
        "ab"         | "eidbaooo"             || true
//        "abcdxabcde" | "abcdeabcdx"           || true
//        "hello"      | "ooolleoooleh"         || false
//        "abc"        | "bbbca"                || true
//        "ky"         | "ainwkckifykxlribaypk" || true
    }

}
