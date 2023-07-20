package pw.avvero.leet.year2023_07


import spock.lang.Specification
import spock.lang.Unroll

class Problem224Tests extends Specification {

    @Unroll
    def "test"() {
        expect:
        new Problem224().calculate(exp) == result
        where:
        exp                   | result
        "1-(2+1)"             | -2
        "1 - 2 + 1"           | 0
        "1-(-2)"              | 3
        "1-(     -2)"         | 3
        "-(2 + 3)"            | -5
        "1-(2+1+1)"           | -3
        "10+21"               | 31
        "1 - (2 + 1)"         | -2
        "(1 - 2) + 1"         | 0
        " 2-1 + 2 "           | 3
        "1 + 1"               | 2
        "1 + 1 + 3"           | 5
        "10 + 21"             | 31
        "10 + 21+ 12"         | 43
        "(1+(4+5+2)-3)+(6+8)" | 23
    }
}
