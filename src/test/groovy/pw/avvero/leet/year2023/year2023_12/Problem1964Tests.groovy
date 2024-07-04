package pw.avvero.leet.year2023.year2023_12

import pw.avvero.leet.year2023.year2023_12.Problem1964
import spock.lang.Specification
import spock.lang.Unroll

class Problem1964Tests extends Specification {

    @Unroll
    def "test"() {
        expect:
        new Problem1964().longestObstacleCourseAtEachPosition(obstacles as int[]) == result as int[]
        where:
        obstacles          || result
        [2, 2, 1]          || [1, 2, 1]
        [1, 2, 3, 2]       || [1, 2, 3, 3]
        [3, 1, 5, 6, 4, 2] || [1, 1, 2, 3, 2, 2]
    }

}
