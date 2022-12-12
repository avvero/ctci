package pw.avvero.leet

import spock.lang.Specification
import spock.lang.Unroll

class Problem733Tests extends Specification {

    @Unroll
    def "Test"() {
        expect:
        new Problem733().floodFill(image as int[][], sr, sc, color) as int[][] == result as int[][]
        where:
        image                             | sr | sc | color || result
        [[1, 1, 1], [1, 1, 0], [1, 0, 1]] | 1  | 1  | 2     || [[2, 2, 2], [2, 2, 0], [2, 0, 1]]

    }

}
