package pw.avvero.leet

import spock.lang.Specification
import spock.lang.Unroll

class Problem33Tests extends Specification {

    @Unroll
    def "test"() {
        expect:
        new Problem33().search(nums as int[], target) == result
        where:
        nums            | target || result
//        [4, 5, 6, 7, 8, 1, 2, 3] | 8      || 4
        [5, 1, 2, 3, 4] | 1      || 1
    }

}
