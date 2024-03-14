package pw.avvero.leet.year2024_02


import spock.lang.Specification
import spock.lang.Unroll

class ProblemTests377 extends Specification {

    @Unroll
    def "test"() {
        expect:
        new Problem377().combinationSum4(nums as int[], target) == result
        where:
        nums   | target || result
        [1, 2] | 4      || 5
    }

}
