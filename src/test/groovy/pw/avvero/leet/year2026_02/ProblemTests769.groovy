package pw.avvero.leet.year2026_02


import spock.lang.Specification
import spock.lang.Unroll

class ProblemTests769 extends Specification {

    @Unroll
    def "test"() {
        expect:
        new Problem769().maxChunksToSorted([1,2,0,3] as int[]) == 2
        new Problem769().maxChunksToSorted([4,3,2,1,0] as int[]) == 1
        new Problem769().maxChunksToSorted([1,0,2,3,4] as int[]) == 4

    }

}
