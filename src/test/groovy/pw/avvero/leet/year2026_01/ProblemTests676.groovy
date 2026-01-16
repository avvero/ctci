package pw.avvero.leet.year2026_01


import spock.lang.Specification
import spock.lang.Unroll

class ProblemTests676 extends Specification {

    @Unroll
    def "test"() {
        expect:
        Problem676 magicDictionary = new Problem676();
        magicDictionary.buildDict(["hello", "leetcode"] as String[]);
        !magicDictionary.search("hello")
        magicDictionary.search("hhllo")
        !magicDictionary.search("hell")
        !magicDictionary.search("leetcoded")
    }

}
