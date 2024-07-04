package pw.avvero.leet.year2023.year2023_11

import pw.avvero.leet.year2023.year2023_11.Problem119
import spock.lang.Specification
import spock.lang.Unroll

class Problem119Tests extends Specification {

    @Unroll
    def "test1"() {
        expect:
        new Problem119().getRow(index) == result
        where:
        index || result
        3     || [1, 3, 3, 1]
        0     || [1]
        1     || [1,1]
    }
}
