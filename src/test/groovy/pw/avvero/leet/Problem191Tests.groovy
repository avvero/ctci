package pw.avvero.leet

import spock.lang.Specification
import spock.lang.Unroll

class Problem191Tests extends Specification {

    @Unroll
    def "test"() {
        expect:
        new Problem191().hammingWeight(n) == result
        where:
        n  || result
        -3 || 1
    }

}
