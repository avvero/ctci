package pw.avvero.leet

import spock.lang.Specification
import spock.lang.Unroll

class Problem70Tests extends Specification {

    @Unroll
    def "test"() {
        expect:
        new Problem70().climbStairs(n) == result
        where:
        n  || result
        2  || 2
        3  || 3
        10 || 89
        43 || 701408733
        44 || 1134903170
    }

}
