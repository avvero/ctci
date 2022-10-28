package pw.avvero.ctci.chapter9

import spock.lang.Specification
import spock.lang.Unroll

class Chapter9Ex1Tests extends Specification {

    @Unroll
    def "Ways to run #n stairs: #ways"() {
        expect:
        StairWalker.getWays(n) == ways
        where:
        n | ways
        1 | [[1]]
        2 | [[1, 1], [2]]
        3 | [[1, 1, 1], [2, 1], [1, 2], [3]]
        4 | [[1, 1, 1, 1], [2, 1, 1], [1, 2, 1], [3, 1], [1, 1, 2], [2, 2], [1, 3]]
    }

}
