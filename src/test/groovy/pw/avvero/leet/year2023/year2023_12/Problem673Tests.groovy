package pw.avvero.leet.year2023.year2023_12

import pw.avvero.leet.year2023.year2023_12.Problem673
import spock.lang.Specification
import spock.lang.Unroll

class Problem673Tests extends Specification {

    @Unroll
    def "test"() {
        expect:
        new Problem673().findNumberOfLIS(nums as int[]) == result
        where:
        nums                     || result
        [1, 2, 4, 3, 5, 4, 7, 2] || 3
    }

}
