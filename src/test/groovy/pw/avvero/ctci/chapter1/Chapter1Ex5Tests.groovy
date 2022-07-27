package pw.avvero.ctci.chapter1

import pw.avvero.ctci.chapter1.Chapter1Ex5
import spock.lang.Specification
import spock.lang.Unroll

class Chapter1Ex5Tests extends Specification {

    @Unroll
    def "1: #input becomes #output after compression"() {
        expect:
        Chapter1Ex5.compress(input) == output
        where:
        input         | output
        null          | null
        "abca"        | "abca"
        "aabcccccaaa" | "a2b1c5a3"
    }
}
