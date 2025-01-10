package pw.avvero.leet.year2024.year2024_03

import pw.avvero.leet.year2024.year2024_03.Problem1926
import spock.lang.Specification
import spock.lang.Unroll

class ProblemTests1926 extends Specification {

    @Unroll
    def "test"() {
        expect:
        new Problem1926().nearestExit(maze, entrance) == result
        where:
        maze                                                                           | entrance        || result
        [["+", "+", ".", "+"], [".", ".", ".", "+"], ["+", "+", "+", "."]] as char[][] | [1, 2] as int[] || 1
    }

}
