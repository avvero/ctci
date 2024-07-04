package pw.avvero.leet.year2023.year2023_04

import pw.avvero.leet.year2023.year2023_04.Problem324
import spock.lang.Specification
import spock.lang.Unroll

class Problem324Tests extends Specification {

    @Unroll
    def "test"() {
        when:
        int[] tnums = nums as int[]
        new Problem324().wiggleSort(tnums)
        then:
        tnums == result as int[]
        where:
        nums               | result
//        [1, 5, 1, 1, 6, 4] | [1, 6, 1, 5, 1, 4]
        [1, 3, 2, 2, 3, 1] | [2, 3, 1, 3, 1, 2]
    }
}
