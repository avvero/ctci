package pw.avvero.leet.year2024_06


import spock.lang.Specification
import spock.lang.Unroll

class ProblemTests31 extends Specification {

    @Unroll
    def "test"() {
        when:
        new Problem31().nextPermutation(nums as int[])
        then:
        nums == result
        where:
        nums                  || result
        [4, 2, 0, 2, 3, 2, 0] || [4, 2, 0, 3, 0, 2, 2]

    }

}
