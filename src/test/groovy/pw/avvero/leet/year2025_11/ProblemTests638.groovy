package pw.avvero.leet.year2025_11


import spock.lang.Specification
import spock.lang.Unroll

class ProblemTests638 extends Specification {

    @Unroll
    def "test"() {
        expect:
        new Problem638().shoppingOffers([2,3], [[1,0,1],[0,1,2]], [1,1]) == 3
        new Problem638().shoppingOffers([2, 5], [[3, 0, 5], [1, 2, 10]], [3, 2]) == 14
    }

}
