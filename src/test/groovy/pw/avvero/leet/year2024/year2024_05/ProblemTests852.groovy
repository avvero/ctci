package pw.avvero.leet.year2024.year2024_05

import pw.avvero.leet.year2024.year2024_05.Problem852
import spock.lang.Specification
import spock.lang.Unroll

class ProblemTests852 extends Specification {

    @Unroll
    def "test"() {
        expect:
        new Problem852().peakIndexInMountainArray(arr as int[]) == result
        where:
        arr          || result
        [3, 4, 5, 1] || 2

    }

}
