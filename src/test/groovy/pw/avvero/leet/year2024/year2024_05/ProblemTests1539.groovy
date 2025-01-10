package pw.avvero.leet.year2024.year2024_05

import pw.avvero.leet.year2024.year2024_05.Problem1539
import spock.lang.Specification
import spock.lang.Unroll

class ProblemTests1539 extends Specification {

    @Unroll
    def "test"() {
        expect:
        new Problem1539().findKthPositive(arr as int[], k) == result
        where:
        arr                                                                                                         | k  || result
        [8, 11, 16, 20, 29, 30, 32, 33, 37, 39, 42, 44, 46, 47, 48, 50, 52, 56, 60, 63, 64, 65, 68, 70, 72, 74, 80] | 45 || 67
        [2, 3, 4, 7, 11]                                                                                            | 5  || 9
        [1, 10, 21, 22, 25]                                                                                         | 12 || 14
    }

}
