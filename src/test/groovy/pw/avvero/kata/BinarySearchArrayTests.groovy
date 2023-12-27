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
        [1, 2, 3, 4, 5, 6] | 7      || -7
        [1, 2, 3, 4, 5, 6] | 0      || -1
    }

    @Unroll
    def "test2"() {
        expect:
        Arrays.binarySearch(arr as int[], 0, arr.size(), target) == result
        where:
        arr                | target || result
        [1, 2, 3, 4, 5, 6] | 3      || 2
        [1, 2, 3, 4, 5, 6] | 7      || -7
        [1, 2, 3, 4, 5, 6] | 0      || -1
    }

}
