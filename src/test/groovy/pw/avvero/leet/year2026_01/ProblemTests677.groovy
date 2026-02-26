package pw.avvero.leet.year2026_01


import spock.lang.Specification
import spock.lang.Unroll

class ProblemTests677 extends Specification {

    @Unroll
    def "test"() {
        expect:
//        Problem677 mapSum = new Problem677()
//        mapSum.insert("apple", 3)
//        mapSum.sum("ap") == 3
//        mapSum.insert("app", 2)
//        mapSum.sum("ap") == 5

        Problem677 mapSum = new Problem677()
        mapSum.insert("a", 3)
        mapSum.sum("ap") == 0
    }

}
