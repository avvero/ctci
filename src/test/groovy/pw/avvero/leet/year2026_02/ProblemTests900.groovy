package pw.avvero.leet.year2026_02


import spock.lang.Specification
import spock.lang.Unroll

class ProblemTests900 extends Specification {

    @Unroll
    def "test"() {
        when:
        def problem = new Problem900([3, 8, 0, 9, 2, 5] as int[])
        then:
        problem.next(2) == 8
        problem.next(1) == 8
        problem.next(1) == 8
        problem.next(2) == -1
    }
}
