package pw.avvero.leet.year2023.year2023_09

import pw.avvero.leet.year2023.year2023_09.Problem211
import spock.lang.Specification
import spock.lang.Unroll

class Problem211Tests extends Specification {

    @Unroll
    def "test"() {
        when:
        def dictionary = new Problem211.WordDictionary()
        dictionary.addWord("bad")
        dictionary.addWord("dad")
        dictionary.addWord("mad")
        then:
        dictionary.search("pad") == false
        dictionary.search("dad") == true
    }
}
