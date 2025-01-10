package pw.avvero.leet.year2024.year2024_07

import pw.avvero.leet.year2024.year2024_07.Problem165
import spock.lang.Specification
import spock.lang.Unroll

class ProblemTests165 extends Specification {

    @Unroll
    def "test"() {
        expect:
        new Problem165().compareVersion(version1, version2) == result
        where:
        version1 | version2 || result
        "1.2"    | "1.10"   || -1

    }

}
