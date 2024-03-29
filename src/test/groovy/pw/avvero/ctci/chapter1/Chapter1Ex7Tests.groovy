package pw.avvero.ctci.chapter1

import pw.avvero.ctci.chapter1.Chapter1Ex7
import spock.lang.Specification
import spock.lang.Unroll

class Chapter1Ex7Tests extends Specification {

    @Unroll
    def "1: #input zerofies to #output"() {
        expect:
        printMatrix(Chapter1Ex7.zerofy(input as int[][])) == printMatrix(output as int[][])
        where:
        input          | output
        [[1, 1],
         [1, 1]]       | [[1, 1],
                          [1, 1]]
        [[0, 1],
         [1, 1]]       | [[0, 0],
                          [0, 1]]
        [[1, 1, 1],
         [1, 1, 1],
         [1, 1, 1]]    | [[1, 1, 1],
                          [1, 1, 1],
                          [1, 1, 1]]
        [[1, 1, 1],
         [1, 0, 1],
         [1, 1, 1]]    | [[1, 0, 1],
                          [0, 0, 0],
                          [1, 0, 1]]
        [[1, 0, 1],
         [1, 1, 1],
         [1, 1, 1]]    | [[0, 0, 0],
                          [1, 0, 1],
                          [1, 0, 1]]
    }

    @Unroll
    def "2: #input zerofies to #output"() {
        expect:
        printMatrix(Chapter1Ex7.zerofy2(input as int[][])) == printMatrix(output as int[][])
        where:
        input          | output
        [[1, 1],
         [1, 1]]       | [[1, 1],
                          [1, 1]]
        [[0, 1],
         [1, 1]]       | [[0, 0],
                          [0, 1]]
        [[1, 1, 1],
         [1, 1, 1],
         [1, 1, 1]]    | [[1, 1, 1],
                          [1, 1, 1],
                          [1, 1, 1]]
        [[1, 1, 1],
         [1, 0, 1],
         [1, 1, 1]]    | [[1, 0, 1],
                          [0, 0, 0],
                          [1, 0, 1]]
        [[1, 0, 1],
         [1, 1, 1],
         [1, 1, 1]]    | [[0, 0, 0],
                          [1, 0, 1],
                          [1, 0, 1]]
    }

    def printMatrix(int[][] matrix) {
        return matrix.collect {'| ' + it.join(" | ") + ' |'}.join("\n")
    }
}
