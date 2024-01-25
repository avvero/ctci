package pw.avvero.leet.year2024_01


import spock.lang.Specification
import spock.lang.Unroll

class ProblemTests95 extends Specification {

    @Unroll
    def "test"() {
        expect:
        new Problem95().generateTrees(n).toString() == result
        where:
        n || result
        2 || "[[1, null, 2], [2, 1, null]]"
        3 || "[[1,null,2,null,3],[1,null,3,2],[2,1,3],[3,1,null,null,2],[3,2,null,1]]"
    }

}
