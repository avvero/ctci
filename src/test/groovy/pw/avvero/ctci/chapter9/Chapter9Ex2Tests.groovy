package pw.avvero.ctci.chapter9

import spock.lang.Specification
import spock.lang.Unroll

class Chapter9Ex2Tests extends Specification {

    @Unroll
    def "Ways to find path in matrix 1"() {
        when:
        def matrix = [[1, 0],
                      [0, 0]]
        then:
        MatrixWalker.getWays(matrix) == result
        where:
        result = [
                [[1, 0],
                 [0, 0]]
        ]
    }

    @Unroll
    def "Ways to find path in matrix 2"() {
        when:
        def matrix = [[0, 1],
                      [0, 0]]
        then:
        MatrixWalker.getWays(matrix) == result
        where:
        result = [
                [[1, 1],
                 [0, 0]]
        ]
    }

    @Unroll
    def "Ways to find path in matrix 3"() {
        when:
        def matrix = [[0, 0],
                      [0, 1]]
        then:
        MatrixWalker.getWays(matrix) == result
        where:
        result = [
                [[1, 1],
                 [0, 1]],
                [[1, 0],
                 [1, 1]]
        ]
    }

    @Unroll
    def "Ways to find path in matrix 4"() {
        when:
        def matrix = [[0, 0, 0, 0, 0],
                      [0, 1, 0, 0, 0],
                      [0, 0, 0, 0, 0],
                      [0, 0, 0, 0, 0],
                      [0, 0, 0, 0, 0]]
        then:
        MatrixWalker.getWays(matrix) == result
        where:
        result = [
                [[1, 1, 0, 0, 0],
                 [0, 1, 0, 0, 0],
                 [0, 0, 0, 0, 0],
                 [0, 0, 0, 0, 0],
                 [0, 0, 0, 0, 0]]
        ]
    }

    @Unroll
    def "Ways to find path in matrix 5"() {
        when:
        def matrix = [[0, 0, 0, 0, 0],
                      [0, 0, 0, 0, 0],
                      [0, 0, 1, 0, 0],
                      [0, 0, 0, 0, 0],
                      [0, 0, 0, 0, 0]]
        then:
        MatrixWalker.getWays(matrix) == result
        where:
        result = [
                [[1, 1, 1, 0, 0],
                 [0, 0, 1, 0, 0],
                 [0, 0, 1, 0, 0],
                 [0, 0, 0, 0, 0],
                 [0, 0, 0, 0, 0]],
                [[1, 1, 0, 0, 0],
                 [0, 1, 1, 0, 0],
                 [0, 0, 1, 0, 0],
                 [0, 0, 0, 0, 0],
                 [0, 0, 0, 0, 0]],
                [[1, 1, 0, 0, 0],
                 [0, 1, 0, 0, 0],
                 [0, 1, 1, 0, 0],
                 [0, 0, 0, 0, 0],
                 [0, 0, 0, 0, 0]],
                [[1, 0, 0, 0, 0],
                 [1, 1, 0, 0, 0],
                 [0, 1, 1, 0, 0],
                 [0, 0, 0, 0, 0],
                 [0, 0, 0, 0, 0]],
                [[1, 0, 0, 0, 0],
                 [1, 0, 0, 0, 0],
                 [1, 1, 1, 0, 0],
                 [0, 0, 0, 0, 0],
                 [0, 0, 0, 0, 0]]
        ]
    }

}
