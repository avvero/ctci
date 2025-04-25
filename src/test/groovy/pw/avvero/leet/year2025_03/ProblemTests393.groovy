package pw.avvero.leet.year2025_03


import spock.lang.Specification
import spock.lang.Unroll

class ProblemTests393 extends Specification {

    @Unroll
    def "test"() {
        expect:
        new Problem393().validUtf8(data as int[]) == result
        where:
        data            || result
        [145]           || true
        [230, 136, 145] || true
        [235, 140, 4]   || false
        [197, 130, 1]   || true
    }

}
