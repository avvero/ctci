package pw.avvero.ctci.chapter5

import spock.lang.Specification
import spock.lang.Unroll

class Chapter5Ex2Tests extends Specification {

    @Unroll
    def "#number is #represenation in binary"() {
        expect:
        BinaryPrinter.toBinaryString(number) == represenation
        where:
        number | represenation
        2.0    | "ERROR"
        1.1    | "ERROR"
        0.0    | "0."
        -0.1   | "ERROR"
        0.72   | "0.1011100001010001111011"
    }

    @Unroll
    def "binary #represenation is #number"() {
        expect:
        BinaryPrinter.toFloat(represenation) == number
        where:
        number             | represenation
        0.7200000286102295 | "0.1011100001010001111011"
    }

}
