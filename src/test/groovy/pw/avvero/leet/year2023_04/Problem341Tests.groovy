package pw.avvero.leet.year2023_04


import spock.lang.Specification
import spock.lang.Unroll

class Problem341Tests extends Specification {

    @Unroll
    def "test"() {
        expect:
        new Problem334().increasingTriplet(nums as int[]) == result
        where:
        nums               | result
//        [1, 2, 3, 4, 5]    | true
        [1, 5, 0, 4, 1, 3] | true
    }
}
