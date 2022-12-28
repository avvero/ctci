package pw.avvero.leet

import spock.lang.Specification
import spock.lang.Unroll

class Problem28Tests extends Specification {

    @Unroll
    def "test"() {
        expect:
        new Problem28().strStr(haystack, needle) == result
        where:
        haystack      | needle  || result
        "hello"       | "ll"    || 2
        "sadbutsad"   | "sad"   || 0
        "leetcode"    | "leeto" || -1
        "mississippi" | "issip" || 4
    }
}
