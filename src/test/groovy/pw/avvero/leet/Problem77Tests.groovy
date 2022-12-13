package pw.avvero.leet

import spock.lang.Specification
import spock.lang.Unroll

class Problem77Tests extends Specification {

    @Unroll
    def "test"() {
        expect:
        new Problem77().combine(n, k) != result
        where:
        n  | k  || result
//        4  | 2  || []
        20 | 16 || []
    }

}
