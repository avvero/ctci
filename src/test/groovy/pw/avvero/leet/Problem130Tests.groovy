package pw.avvero.leet


import spock.lang.Specification
import spock.lang.Unroll

class Problem130Tests extends Specification {

    @Unroll
    def "test"() {
        when:
        def board =[["O","X","X","O","X"],["X","O","O","X","O"],["X","O","X","O","X"],["O","X","O","O","O"],["X","X","O","X","O"]]
        and:
        new Problem130().solve(board as char[][])
        then:
        board == [["O","X","X","O","X"],["X","X","X","X","O"],["X","X","X","O","X"],["O","X","O","O","O"],["X","X","O","X","O"]]
    }

}
