package pw.avvero.leet.year2024.year2024_04

import pw.avvero.leet.year2024.year2024_04.Problem200
import spock.lang.Specification
import spock.lang.Unroll

class ProblemTests200 extends Specification {

    @Unroll
    def "test"() {
        expect:
        new Problem200().numIslands(grid as char[][]) == result
        where:
        grid                           || result
        [
                ["1", "1", "0", "0", "0"],
                ["1", "1", "0", "0", "0"],
                ["0", "0", "1", "0", "0"],
                ["0", "0", "0", "1", "1"]
        ]                              || 3
    }

}
