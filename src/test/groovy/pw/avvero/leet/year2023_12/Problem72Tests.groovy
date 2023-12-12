package pw.avvero.leet.year2023_12


import spock.lang.Specification
import spock.lang.Unroll

class Problem72Tests extends Specification {

    @Unroll
    def "test"() {
        expect:
        new Problem72().minDistance(w1, w2) == result
        where:
        w1          | w2          || result
        "sea"       | "ate"       || 3
        "intention" | "execution" || 5
        "a"         | "a"         || 0
        "horse"     | "ros"       || 3

    }

}
