package pw.avvero.leet.year2026_02


import spock.lang.Specification
import spock.lang.Unroll

class ProblemTests885 extends Specification {

    @Unroll
    def "test"() {
        when:
        def problem = new Problem885()
        then:
        problem.spiralMatrixIII(1, 4, 0, 0) == [[0,0],[0,1],[0,2],[0,3]] as int[][]
    }
}
