package pw.avvero.leet.year2024_11


import spock.lang.Specification
import spock.lang.Unroll

class ProblemTests1310 extends Specification {

    @Unroll
    def "test"() {
        expect:
        new Problem1310().xorQueries(arr as int[], queries as int[][]) == result as int[]
        where:
        arr          | queries                          || result
        [1, 3, 4, 8] | [[0, 1], [1, 2], [0, 3], [3, 3]] || [2, 7, 14, 8]
    }

}
