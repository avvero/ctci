package pw.avvero.leet.year2024_03


import spock.lang.Specification
import spock.lang.Unroll

class ProblemTests1129 extends Specification {

    @Unroll
    def "test"() {
        expect:
        new Problem1129().shortestAlternatingPaths(n, red as int[][], blue as int[][]) == result as int[]
        where:
        n | red              | blue || result
        3 | [[0, 1], [1, 2]] | []   || [0, 1, -1]
    }

}
