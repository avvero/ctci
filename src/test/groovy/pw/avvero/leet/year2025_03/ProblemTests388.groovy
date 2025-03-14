package pw.avvero.leet.year2025_03


import spock.lang.Specification
import spock.lang.Unroll

class ProblemTests388 extends Specification {

    @Unroll
    def "test"() {
        expect:
        new Problem388().lengthLongestPath(s) == result
        where:
        s                               || result
        "dir\n\tsubdir1\n\t\tfile1.ext" || 21
    }

}
