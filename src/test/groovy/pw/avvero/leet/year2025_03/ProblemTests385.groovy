package pw.avvero.leet.year2025_03


import spock.lang.Specification
import spock.lang.Unroll

class ProblemTests385 extends Specification {

    @Unroll
    def "test"() {
        expect:
        new Problem385().deserialize(s).integer == integer
        where:
        s     || integer
        "324" || 324
    }

}
