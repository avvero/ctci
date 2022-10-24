package pw.avvero.ctci.chapter5

import spock.lang.Specification

class Chapter5Ex3Tests extends Specification {

    def "Smallest with the same number or 1 in binary representation after #value is #result"() {
        expect:
        IntegerBinaryPrinter.print(value) == valueRepresentation
        IntegerBinaryPrinter.print(result) == resultRepresentation
        NextSmallestBitFinder.search(value) == result
        where:
        value | valueRepresentation || result | resultRepresentation
        12    | "00001100"          || 3      | "00000011"
        123   | "01111011"          || 63     | "00111111"
    }

    def "Biggest with the same number or 1 in binary representation after #value is #result"() {
        expect:
        IntegerBinaryPrinter.print(value) == valueRepresentation
        IntegerBinaryPrinter.print(result) == resultRepresentation
        NextBiggestBitFinder.search(value) == result
        where:
        value | valueRepresentation || result | resultRepresentation
        12    | "00001100"          || 192    | "11000000"
        123   | "01111011"          || 252    | "11111100"
    }

}
