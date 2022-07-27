package pw.avvero.ctci.chapter1

import pw.avvero.ctci.chapter1.Chapter1Ex1
import spock.lang.Specification
import spock.lang.Unroll

class Chapter1Ex1Tests extends Specification {

    @Unroll
    def "1: String #string has unique characters: #result"() {
        expect:
        Chapter1Ex1.hasUniqueOnly(string) == result
        Chapter1Ex1.hasUniqueOnly2(string) == result
        where:
        string | result
        "123"  | true
        "abc"  | true
        "abb"  | false
    }

    @Unroll
    def "2: String #string has unique characters: #result"() {
        expect:
        Chapter1Ex1.hasUniqueOnly2(string) == result
        where:
        string | result
        "123"  | true
        "abc"  | true
        "abb"  | false
    }

    @Unroll
    def "3: String #string has unique characters: #result"() {
        expect:
        Chapter1Ex1.hasUniqueOnly3(string) == result
        where:
        string | result
        "123"  | true
        "abc"  | true
        "abb"  | false
    }

}
