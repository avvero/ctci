package pw.avvero.ctci.chapter5

import spock.lang.Specification

class Chapter5Ex6Tests extends Specification {

    def "#one becomes #two after bit swap"() {
        expect:
        BitSwapper.swap(one) == two
        where:
        one        || two
        "11111111" || "11111111"
        "00000000" || "00000000"
        "10101010" || "01010101"
        "11101010" || "11010101"
    }

}
