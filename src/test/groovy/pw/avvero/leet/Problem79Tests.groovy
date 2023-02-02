package pw.avvero.leet

import spock.lang.Specification
import spock.lang.Unroll

class Problem79Tests extends Specification {

    @Unroll
    def "test"() {
        expect:
        new Problem79().exist(board as char[][], word) == result
        where:
        board                                                              | word           || result
        [["A", "B", "C", "E"], ["S", "F", "C", "S"], ["A", "D", "E", "E"]] | "ABCCED"       || true
        [["A", "B", "C", "E"], ["S", "F", "C", "S"], ["A", "D", "E", "E"]] | "SEE"          || true
        [["A", "B", "C", "E"], ["S", "F", "C", "S"], ["A", "D", "E", "E"]] | "ABCB"         || false
        [["A", "B", "C", "E"], ["S", "F", "E", "S"], ["A", "D", "E", "E"]] | "ABCEFSADEESE" || true
        [["b"], ["a"], ["b"], ["b"], ["a"]]                                | "baa"          || false
        [["C", "A", "A"], ["A", "A", "A"], ["B", "C", "D"]]                | "AAB"          || true
    }

// ["C", "A", "A"],
// ["A", "A", "A"],
// ["B", "C", "D"]
}
