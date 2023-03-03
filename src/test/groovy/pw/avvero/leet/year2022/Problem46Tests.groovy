package pw.avvero.leet.year2022

import pw.avvero.leet.year2022.Problem46
import spock.lang.Specification
import spock.lang.Unroll

class Problem46Tests extends Specification {

    @Unroll
    def "test"() {
        expect:
        new Problem46().permute(nums as int[]) == result
        where:
        nums      || result
//        [1]       || [[1]]
        [0, 1]    || [[0,1],[1,0]]
        [1, 2, 3] || [[1, 2, 3], [1, 3, 2], [2, 1, 3], [2, 3, 1], [3, 1, 2], [3, 2, 1]]
    }

}
