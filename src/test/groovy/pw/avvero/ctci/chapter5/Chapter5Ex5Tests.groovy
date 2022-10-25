package pw.avvero.ctci.chapter5

import spock.lang.Specification
import spock.lang.Unroll

class Chapter5Ex5Tests extends Specification {

    @Unroll
    def "It's required #n bits to make #one be like #two"() {
        expect:
        BitComparator.diff(one, two) == n
        BitComparator.diff2(one, two) == n
        where:
        one | two || n
        31  | 14  || 2
        12  | 145 || 5
    }

}
