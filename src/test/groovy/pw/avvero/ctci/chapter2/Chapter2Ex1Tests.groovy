package pw.avvero.ctci.chapter2

import pw.avvero.ctci.chapter2.Chapter2Ex1
import pw.avvero.ctci.chapter2.Node
import spock.lang.Specification
import spock.lang.Unroll

class Chapter2Ex1Tests extends Specification {

    @Unroll
    def "1: #list without duplicates is #result"() {
        expect:
        Chapter2Ex1.removeDuplicates(Node.of(list)) == Node.of(result)
        where:
        list                  || result
        []                    || []
        [1, 2, 3]             || [1, 2, 3]
        [1, 2, 2]             || [1, 2]
        [2, 2, 2]             || [2]
        [1, 1, 2, 2, 3, 3, 4] || [1, 2, 3, 4]
    }

    @Unroll
    def "2: #list without duplicates is #result"() {
        expect:
        Chapter2Ex1.removeDuplicates2(Node.of(list)) == Node.of(result)
        where:
        list                  || result
        []                    || []
        [1, 2, 3]             || [1, 2, 3]
        [1, 2, 2]             || [1, 2]
        [2, 2, 2]             || [2]
        [1, 1, 2, 2, 3, 3, 4] || [1, 2, 3, 4]
    }
}
