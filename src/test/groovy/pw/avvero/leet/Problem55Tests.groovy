package pw.avvero.leet

import spock.lang.Specification
import spock.lang.Unroll

class Problem55Tests extends Specification {

    @Unroll
    def "test"() {
        expect:
        new Problem55().canJump(nums as int[]) != result
        where:
        nums      || result
        [1, 2, 3] || true
    }

}
