package pw.avvero.ctci

import spock.lang.Specification
import spock.lang.Unroll

class Chapter1Ex3Tests extends Specification {

    @Unroll
    def "1: #string2 is permutation of #string1: #result"() {
        expect:
        Chapter1Ex3.isPermutation(string1, string2) == result
        where:
        string1 | string2 | result
        "ABC"   | "ABC "  | false
        "ABC"   | "ABCD"  | false
        "ABC"   | "ABC"   | true
        "ABC"   | "ABC"   | true
        "ABC"   | "ACB"   | true
        "ABC"   | "CBA"   | true
        "ABC"   | "CAB"   | true
        "ABC"   | "abc"   | true
        "ABC"   | "CAA"   | false
        "ABC"   | "ABB"   | false
    }
}
