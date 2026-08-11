package pw.avvero.leet.year2026_02


import spock.lang.Specification
import spock.lang.Unroll

class ProblemTests855 extends Specification {

    @Unroll
    def "test"() {
        expect:
        def e = new Problem855(10)
        e.seat() == 0
        e.seat() == 9
        e.seat() == 4
        e.seat() == 2
        e.leave(4)
        e.seat() == 5

    }
    @Unroll
    def "test2"() {
        expect:
        def e = new Problem855(4)
        e.seat() == 0
        e.seat() == 3
        e.seat() == 1
        e.seat() == 2
        e.leave(1)
        e.leave(3)
        e.seat() == 1

    }

}
