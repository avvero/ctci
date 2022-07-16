package pw.avvero.ctci

import spock.lang.Specification
import spock.lang.Unroll

class Chapter1Ex6Tests extends Specification {

    @Unroll
    def "1: #input becomes #output after rotation"() {
        expect:
        printMatrix(Chapter1Ex6.rotate(input as int[][])) == printMatrix(output as int[][])
        where:
        input          | output
        [[0, 0],
         [0, 0]]       | [[0, 0],
                          [0, 0]]
        [[1, 0],
         [1, 1]]       | [[1, 1],
                          [1, 0]]
        [[1, 0, 0],
         [1, 0, 1],
         [1, 0, 0]]    | [[1, 1, 1],
                          [0, 0, 0],
                          [0, 1, 0]]
        [[1, 0, 0, 0],
         [1, 0, 1, 0],
         [1, 0, 0, 1],
         [1, 1, 0, 1]] | [[1, 1, 1, 1],
                          [1, 0, 0, 0],
                          [0, 0, 1, 0],
                          [1, 1, 0, 0]]
    }

    def printMatrix(int[][] matrix) {
        return matrix.collect {'| ' + it.join(" | ") + ' |'}.join("\n")
    }
}
