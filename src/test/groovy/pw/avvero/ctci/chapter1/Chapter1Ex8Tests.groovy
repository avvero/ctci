package pw.avvero.ctci.chapter1

import pw.avvero.ctci.chapter1.Chapter1Ex8
import spock.lang.Specification
import spock.lang.Unroll

class Chapter1Ex8Tests extends Specification {

    @Unroll
    def "1: #s2 is substring of #s1: #result"() {
        expect:
        Chapter1Ex8.isSubstring(s1, s2) == result
        where:
        s1            | s2            || result
        "a"           | "a"           || true
        "a"           | "b"           || false
        "ab"          | "b"           || true
        "waterbottle" | "water"       || true
        "waterbottle" | "bottle"      || true
        "waterbottle" | "water1"      || false
        "waterbottle" | "bottle1"     || false
        "waterbottle" | "waterbottle" || true
        "waterbottle" | "erbottlewat" || true
    }
}
