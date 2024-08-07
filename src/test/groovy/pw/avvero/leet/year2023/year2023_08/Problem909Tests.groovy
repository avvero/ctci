package pw.avvero.leet.year2023.year2023_08

import pw.avvero.leet.year2023.year2023_08.Problem909
import spock.lang.Specification
import spock.lang.Unroll

class Problem909Tests extends Specification {

    @Unroll
    def "test"() {
        when:
        def board = [
                [-1, -1, -1, -1, -1, -1] as int[],
                [-1, -1, -1, -1, -1, -1] as int[],
                [-1, -1, -1, -1, -1, -1] as int[],
                [-1, 35, -1, -1, 13, -1] as int[],
                [-1, -1, -1, -1, -1, -1] as int[],
                [-1, 15, -1, -1, -1, -1] as int[]
        ] as int[][]
        then:
        new Problem909().snakesAndLadders(board) == 4
    }

    @Unroll
    def "test2"() {
        when:
        def board = [
                [-1, -1] as int[],
                [-1, 3] as int[]
        ] as int[][]
        then:
        new Problem909().snakesAndLadders(board) == 1
    }

    @Unroll
    def "test3"() {
        when:
        def board = [
                [-1, -1, -1],
                [-1, 9, 8],
                [-1, 8, 9]
        ] as int[][]
        then:
        new Problem909().snakesAndLadders(board) == 1
    }

    @Unroll
    def "test4"() {
        when:
        def board = [
                [-1, 4, -1],
                [6, 2, 6],
                [-1, 3, -1]
        ] as int[][]
        then:
        new Problem909().snakesAndLadders(board) == 2
    }

    @Unroll
    def "test5"() {
        when:
        def board = [
                [-1, 4],
                [-1, 3]
        ] as int[][]
        then:
        new Problem909().snakesAndLadders(board) == 1
    }

    @Unroll
    def "test6"() {
        when:
        def board = [
                [1, 1, -1],
                [1, 1, 1],
                [-1, 1, 1]
        ] as int[][]
        then:
        new Problem909().snakesAndLadders(board) == -1
    }

    @Unroll
    def "test7"() {
        when:
        def board = [
                [-1, -1, -1, 46, 47, -1, -1, -1],
                [51, -1, -1, 63, -1, 31, 21, -1],
                [-1, -1, 26, -1, -1, 38, -1, -1],
                [-1, -1, 11, -1, 14, 23, 56, 57],
                [11, -1, -1, -1, 49, 36, -1, 48],
                [-1, -1, -1, 33, 56, -1, 57, 21],
                [-1, -1, -1, -1, -1, -1, 2, -1],
                [-1, -1, -1,  8,  3, -1, 6,  56]
        ] as int[][]
        then:
        new Problem909().snakesAndLadders(board) == 4
    }

    @Unroll
    def "testend"() {
        expect:
        new Problem909().next(matrix as int[][], current as int[], n) == result as int[]
        where:
        matrix      | current | n || result
        [[7, 8, 9],
         [6, 5, 4],
         [1, 2, 3]] | [2, 0]  | 1 || [2, 1]
        [[7, 8, 9],
         [6, 5, 4],
         [1, 2, 3]] | [2, 0]  | 2 || [2, 2]
        [[7, 8, 9],
         [6, 5, 4],
         [1, 2, 3]] | [2, 0]  | 3 || [1, 2]
        [[7, 8, 9],
         [6, 5, 4],
         [1, 2, 3]] | [2, 0]  | 4 || [1, 1]
        [[7, 8, 9],
         [6, 5, 4],
         [1, 2, 3]] | [2, 0]  | 5 || [1, 0]
        [[7, 8, 9],
         [6, 5, 4],
         [1, 2, 3]] | [2, 0]  | 6 || [0, 0]
    }

    @Unroll
    def "testend"() {
        expect:
        new Problem909().next(matrix as int[][], current as int[], n) == result as int[]
        where:
        matrix   | current | n || result
        [[4, 3],
         [1, 2]] | [1, 0]  | 1 || [1, 1]
        [[4, 3],
         [1, 2]] | [1, 0]  | 2 || [0, 1]
        [[4, 3],
         [1, 2]] | [1, 0]  | 3 || [0, 0]
    }
}
