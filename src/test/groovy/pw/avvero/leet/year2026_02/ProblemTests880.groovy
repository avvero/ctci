package pw.avvero.leet.year2026_02


import spock.lang.Specification
import spock.lang.Unroll

class ProblemTests880 extends Specification {

    @Unroll
    def "test"() {
        when:
        def problem = new Problem880()
        then:
        problem.decodeAtIndex("ha22", 5) == "h"
        problem.decodeAtIndex("leet2code3", 10) == "o"
        problem.decodeAtIndex("a2345678999999999999999", 1) == "a"
    }
}
