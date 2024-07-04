package pw.avvero.leet.year2023.year2023_12

import pw.avvero.leet.year2023.year2023_12.Problem354
import spock.lang.Specification
import spock.lang.Unroll

class Problem354Tests extends Specification {

    @Unroll
    def "test"() {
        expect:
        new Problem354().maxEnvelopes(envs as int[][]) == result
        where:
        envs                                                                                       || result
        [[30, 50], [12, 2], [3, 4], [12, 15]]                                                      || 3
        [[2, 100], [3, 200], [4, 300], [5, 500], [5, 400], [5, 250], [6, 370], [6, 360], [7, 380]] || 5
        [[5, 4], [6, 4], [6, 7], [2, 3]]                                                           || 3
        [[1, 1], [1, 1], [1, 1]]                                                                   || 1
    }

}
