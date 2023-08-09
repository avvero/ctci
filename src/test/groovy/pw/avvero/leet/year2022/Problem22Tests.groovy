package pw.avvero.leet.year2022

import pw.avvero.leet.year2022.Problem22
import spock.lang.Specification
import spock.lang.Unroll

class Problem22Tests extends Specification {

    @Unroll
    def "test"() {
        expect:
        new Problem22().generateParenthesis(n) == result
        where:
        n || result
        2 || ["((()))", "(()())", "(())()", "()(())", "()()()"]
        3 || ["((()))", "(()())", "(())()", "()(())", "()()()"]
    }
}
