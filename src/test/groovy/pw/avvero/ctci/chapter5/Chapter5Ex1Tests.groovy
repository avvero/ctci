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

//        10001001100
//        00000000001
//        00000100000
//        00000011111
//        00001111100
//        11110000011

//        000000 0
//        000001 1
//        000011 3
//        000100 3
//        000111 7
//        001000 8
//        001001 9
//        001010 10
//        001011 11
//        001100 12
//        001101 13
//        001110 14
//        001111 15
//        010000 16 (2 pw (j - i - 1)) - 1
    }

}
