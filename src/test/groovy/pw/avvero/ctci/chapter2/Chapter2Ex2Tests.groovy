package pw.avvero.ctci.chapter2

import pw.avvero.ctci.chapter2.Chapter2Ex2
import pw.avvero.ctci.chapter2.Node
import spock.lang.Specification
import spock.lang.Unroll

import java.util.concurrent.atomic.AtomicInteger

class Chapter2Ex2Tests extends Specification {

    @Unroll
    def "1: #k to last element from #list with size #size is #result"() {
        expect:
        Chapter2Ex2.findKthToLast(Node.of(list), size, k)?.value == result
        where:
        list      | size | k || result
        []        | 0    | 0 || null
        [1]       | 1    | 1 || 1
        [1, 2]    | 2    | 1 || 2
        [1, 2, 3] | 3    | 1 || 3
        [1, 2, 3] | 3    | 2 || 2
        [1, 2, 3] | 3    | 3 || 1
        [1, 2, 3] | 3    | 4 || null
    }

    @Unroll
    def "2: #k to last element from #list is #result"() {
        expect:
        Chapter2Ex2.findKthToLast(Node.of(list), k)?.value == result
        where:
        list      | k || result
        []        | 0 || null
        [1]       | 1 || 1
        [1, 2]    | 1 || 2
        [1, 2, 3] | 1 || 3
        [1, 2, 3] | 2 || 2
        [1, 2, 3] | 3 || 1
        [1, 2, 3] | 4 || null
    }

    @Unroll
    def "3: #k to last element from #list is #result"() {
        expect:
        Chapter2Ex2.findKthToLast2(Node.of(list), new AtomicInteger(k))?.value == result
        where:
        list      | k || result
        []        | 0 || null
        [1]       | 1 || 1
        [1, 2]    | 1 || 2
        [1, 2, 3] | 1 || 3
        [1, 2, 3] | 2 || 2
        [1, 2, 3] | 3 || 1
        [1, 2, 3] | 4 || null
    }
}
