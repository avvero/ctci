package pw.avvero.leet.year2023.year2023_07

import pw.avvero.leet.year2023.year2023_07.Problem452
import spock.lang.Specification
import spock.lang.Unroll

class Problem452Tests extends Specification {

    @Unroll
    def "test"() {
        expect:
        new Problem452().findMinArrowShots(points as int[][]) == result
        where:
        points                                                                                | result
        [[3, 9], [7, 12], [3, 8], [6, 8], [9, 10], [2, 9], [0, 9], [3, 9], [0, 6], [2, 8]]    | 2
        [[0, 9], [1, 8], [7, 8], [1, 6], [9, 16], [7, 13], [7, 10], [6, 11], [6, 9], [9, 13]] | 3
        [[0, 1], [2, 3], [2, 3], [4, 5]]                                                      | 3
        [[1, 3], [2, 3]]                                                                      | 1
        [[1, 2], [3, 4]]                                                                      | 2
        [[2, 3], [2, 3]]                                                                      | 1
        [[2, 3], [2, 3], [2, 3]]                                                              | 1
        [[2, 3], [2, 3], [4, 5]]                                                              | 2
        [[0, 1], [2, 3], [2, 3]]                                                              | 2
        [[3, 9], [7, 12], [3, 8], [6, 8], [9, 10], [2, 9], [0, 9], [3, 9], [0, 6], [2, 8]]    | 2
        //
        [[10, 16], [2, 8], [1, 6], [7, 12]]                                                   | 2
        [[1, 2], [3, 4], [5, 6], [7, 8]]                                                      | 4
        [[1, 2], [2, 3], [3, 4], [4, 5]]                                                      | 2
    }
}
