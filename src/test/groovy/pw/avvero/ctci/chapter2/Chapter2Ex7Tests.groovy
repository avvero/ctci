package pw.avvero.ctci.chapter2

import spock.lang.Specification
import spock.lang.Unroll

class Chapter2Ex7Tests extends Specification {

    @Unroll
    def "1: #list is palindrome: #result"() {
        expect:
        Chapter2Ex7.isPalindrome(Node.of(list)) == result
        where:
        list                      || result
        [0, 1, 2, 1, 0]           || true
        ["a", "b", "c"]           || false
        ["a", "b", "a"]           || true
        ["a", "b", "c", "b", "a"] || true
        ["a", "b", "c", "d", "a"] || false
        ["a", "b", "c", "b", "e"] || false
    }
}
