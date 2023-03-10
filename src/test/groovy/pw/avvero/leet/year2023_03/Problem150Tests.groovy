package pw.avvero.leet.year2023_03


import spock.lang.Specification
import spock.lang.Unroll

class Problem150Tests extends Specification {

    @Unroll
    def "test"() {
        expect:
        new Problem150().evalRPN(s as String[]) == result
        where:
        s                                                                     || result
//        ["2", "1", "+", "3", "*"]                                             || 9
//        ["4", "13", "5", "/", "+"]                                            || 6
        ["10", "6", "9", "3", "+", "-11", "*", "/", "*", "17", "+", "5", "+"] || 22
    }
}
