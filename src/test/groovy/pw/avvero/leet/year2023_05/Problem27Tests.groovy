package pw.avvero.leet.year2023_05


import spock.lang.Specification
import spock.lang.Unroll

class Problem27Tests extends Specification {

    @Unroll
    def "test"() {
        when:
        def arg = nums as int[]
        then:
        new Problem27().removeElement(arg, val) == result
        nums == expected
        where:
        nums                     | val | result | expected
        [0, 1, 2, 2, 3, 0, 4, 2] | 2   | 5      | [0, 1, 4, 0, 3]
        [3, 2, 2, 3]             | 3   | 2      | [2, 2, 0, 0]
    }
}
