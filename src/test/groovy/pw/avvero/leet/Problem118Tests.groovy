package pw.avvero.leet


import spock.lang.Specification
import spock.lang.Unroll

class Problem118Tests extends Specification {

    @Unroll
    def "test"() {
        expect:
        new Problem118().generate(number) == result
        where:
        number || result
        5      || [[1], [1, 1], [1, 2, 1], [1, 3, 3, 1], [1, 4, 6, 4, 1]]
    }

}
