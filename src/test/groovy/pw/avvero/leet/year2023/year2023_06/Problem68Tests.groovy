package pw.avvero.leet.year2023.year2023_06

import pw.avvero.leet.year2023.year2023_06.Problem68
import spock.lang.Specification
import spock.lang.Unroll

class Problem68Tests extends Specification {

    @Unroll
    def "test"() {
        expect:
        new Problem68().fullJustify(words as String[], width) == result
        where:
        words                                                           | width || result
        ["This", "is", "an", "example", "of", "text", "justification."] | 16    || ["This    is    an", "example  of text", "justification.  "]
    }
}
