package pw.avvero.ctci.chapter1

import pw.avvero.ctci.chapter1.Chapter1Ex2
import spock.lang.Specification
import spock.lang.Unroll

class Chapter1Ex2Tests extends Specification {

    @Unroll
    def "1: String #string reverses to: #result"() {
        expect:
        Chapter1Ex2.reverse(string) == result
        where:
        string | result
        "123"  | "321"
        "abc"  | "cba"
        "abb"  | "bba"
    }
}
