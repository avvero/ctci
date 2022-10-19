package pw.avvero.ctci.chapter5

import spock.lang.Specification
import spock.lang.Unroll

import static java.lang.Integer.parseInt

class Chapter5Ex1Tests extends Specification {

    @Unroll
    def "Bitwise concatenation of #a and #b is #c"() {
        expect:
        Integer.toBinaryString(BitwiseConcater.concat(parseInt(a, 2), parseInt(b, 2), i, j)) == c
        where:
        a             | b       | i | j || c
        "10000000000" | "10011" | 2 | 6 || "10001001100"
        "10001000000" | "10011" | 2 | 6 || "10001001100"
        "10001001100" | "10011" | 2 | 6 || "10001001100"
        "10001111100" | "10011" | 2 | 6 || "10001001100"
    }

}
