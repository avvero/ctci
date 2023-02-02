package pw.avvero.leet

import spock.lang.Specification
import spock.lang.Unroll

class Problem69Tests extends Specification {

    @Unroll
    def "test"() {
        expect:
        new Problem69().mySqrt(x) == result
        where:
        x          || result
        2147483647 || 46340
    }

}
