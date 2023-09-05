package pw.avvero.leet.year2023_09


import spock.lang.Specification
import spock.lang.Unroll

class Problem212Tests extends Specification {

    @Unroll
    def "test1"() {
        expect:
        new Problem212().findWords(board, words) == ["oath","eat"]
        where:
        board = [["o","a","a","n"],["e","t","a","e"],["i","h","k","r"],["i","f","l","v"]] as char[][]
        words = ["oath","pea","eat","rain"] as String[]
    }

    @Unroll
    def "test2"() {
        expect:
        new Problem212().findWords(board, words) ==[]
        where:
        board = [["a"]] as char[][]
        words = ["ab"] as String[]
    }

    @Unroll
    def "test3"() {
        expect:
        new Problem212().findWords(board, words) ==[]
        where:
        board = [["a"]] as char[][]
        words = ["b"] as String[]
    }

    @Unroll
    def "test4"() {
        expect:
        new Problem212().findWords(board, words) == ["abcdefg","gfedcbaaa","eaabcdgfa","befa","dgc","ade"]
        where:
        board = [
                ["a","b","c"],
                ["a","e","d"],
                ["a","f","g"]
        ] as char[][]
        words = ["abcdefg","gfedcbaaa","eaabcdgfa","befa","dgc","ade"] as String[]
    }

    @Unroll
    def "test5"() {
        expect:
        new Problem212().findWords(board, words) == ["abcdefg","befa","eaabcdgfa","gfedcbaaa"]
        where:
        board = [
                ["a","a","a","a","a","a","a","a","a","a","a","a"],
                ["a","a","a","a","a","a","a","a","a","a","a","a"],
                ["a","a","a","a","a","a","a","a","a","a","a","a"],
                ["a","a","a","a","a","a","a","a","a","a","a","a"],
                ["a","a","a","a","a","a","a","a","a","a","a","a"],
                ["a","a","a","a","a","a","a","a","a","a","a","a"],
                ["a","a","a","a","a","a","a","a","a","a","a","a"],
                ["a","a","a","a","a","a","a","a","a","a","a","a"],
                ["a","a","a","a","a","a","a","a","a","a","a","a"],
                ["a","a","a","a","a","a","a","a","a","a","a","a"],
                ["a","a","a","a","a","a","a","a","a","a","a","a"],
                ["a","a","a","a","a","a","a","a","a","a","a","a"]
        ] as char[][]
        words = ["a","aa","aaa","aaaa","aaaaa","aaaaaa","aaaaaaa","aaaaaaaa","aaaaaaaaa","aaaaaaaaaa"] as String[]
    }
}
