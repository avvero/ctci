package pw.avvero.leet.year2025_10


import spock.lang.Specification
import spock.lang.Unroll

class ProblemTests621 extends Specification {

    @Unroll
    def "test"() {
        expect:
        new Problem621().leastInterval(tasks as char[], n) == result
        where:
        tasks                          | n || result
        ["A", "A", "A", "B", "B", "B"] | 3 || 10
        ["A", "A", "A", "B", "B", "B"] | 2 || 8
    }

}
