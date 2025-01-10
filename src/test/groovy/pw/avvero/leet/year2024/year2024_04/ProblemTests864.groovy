package pw.avvero.leet.year2024.year2024_04

import pw.avvero.leet.year2024.year2024_04.Problem864
import spock.lang.Specification
import spock.lang.Unroll

class ProblemTests864 extends Specification {

    @Unroll
    def "test"() {
        expect:
        new Problem864().shortestPathAllKeys(grid as String[]) == result
        where:
        grid                        || result
        ["@...a", ".###A", "b.BCc"] || 10
        ["@.a..", "###.#", "b.A.B"] || 8
    }

}
