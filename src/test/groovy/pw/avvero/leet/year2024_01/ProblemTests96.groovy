package pw.avvero.leet.year2024_01


import spock.lang.Specification
import spock.lang.Unroll

class ProblemTests96 extends Specification {

    @Unroll
    def "test"() {
        expect:
        new Problem96().numTrees(n) == result
        where:
        n || result
        6 || 42
    }

}
