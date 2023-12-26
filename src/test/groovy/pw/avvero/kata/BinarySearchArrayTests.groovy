package pw.avvero.kata


import spock.lang.Specification
import spock.lang.Unroll

class BinarySearchArrayTests extends Specification {

    @Unroll
    def "test"() {
        expect:
        new BinarySearchArray().search(arr as int[], target) == result
        where:
        arr                | target || result
        [1, 2, 3, 4, 5, 6] | 3      || 2
    }

}
