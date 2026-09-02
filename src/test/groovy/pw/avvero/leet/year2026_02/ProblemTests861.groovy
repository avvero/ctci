package pw.avvero.leet.year2026_02


import spock.lang.Specification
import spock.lang.Unroll

class ProblemTests861 extends Specification {

    @Unroll
    def "test"() {
        when:
        def problem = new Problem861()
        then:
        problem.matrixScore([[0,1],[1,1]] as int[][]) == 5
        problem.matrixScore([[0,0,1,1],[1,0,1,0],[1,1,0,0]] as int[][]) == 39
    }
}
