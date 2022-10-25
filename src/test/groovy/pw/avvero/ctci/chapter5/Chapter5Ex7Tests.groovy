package pw.avvero.ctci.chapter5

import spock.lang.Specification
import spock.lang.Unroll

class Chapter5Ex7Tests extends Specification {

    @Unroll
    def "Missing number in #array is #missing"() {
        expect:
        MissingFinder.findDumb(array as int[], n) == missing
        MissingFinder.find(array as int[], n) == missing
        where:
        array                       | n  | missing
        [0, 1, 2, 3, 4, 6, 7, 8, 9] | 10 | 5
    }

}
