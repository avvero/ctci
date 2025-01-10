package pw.avvero.leet.year2024.year2024_12

import pw.avvero.leet.year2024.year2024_12.Problem43
import spock.lang.Specification
import spock.lang.Unroll

class ProblemTests43 extends Specification {

    @Unroll
    def "test"() {
        expect:
        new Problem43().multiply(s1, s2) == s3
        where:
        s1    | s2    || s3
        "123" | "456" || "56088"
        "2"   | "3"   || "6"
    }

}
