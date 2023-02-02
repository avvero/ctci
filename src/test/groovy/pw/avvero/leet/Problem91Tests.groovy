package pw.avvero.leet

import spock.lang.Specification
import spock.lang.Unroll

class Problem91Tests extends Specification {

    @Unroll
    def "test"() {
        expect:
        new Problem91().numDecodings(string) == result
        where:
        string                                          || result
//        "12"                                            || 2
//        "226"                                           || 3
//        "06"                                            || 0
//        "22622"                                         || 6
        "111111111111111111111111111111111111111111111" || 6
    }

}
