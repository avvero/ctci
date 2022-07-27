package pw.avvero.ctci.chapter1

import pw.avvero.ctci.chapter1.Chapter1Ex4
import spock.lang.Specification
import spock.lang.Unroll

class Chapter1Ex4Tests extends Specification {

    @Unroll
    def "1: #input becomes #output after replacement"() {
        expect:
        Chapter1Ex4.escape(input) == output
        where:
        input               | output
        null                | null
        "Mr John Smith    " | "Mr%20John%20Smith"
        "Mr%20John%20Smith" | "Mr%20John%20Smith"

    }
}
