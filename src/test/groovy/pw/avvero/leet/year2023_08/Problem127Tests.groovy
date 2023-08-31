package pw.avvero.leet.year2023_08


import spock.lang.Specification
import spock.lang.Unroll

class Problem127Tests extends Specification {

    @Unroll
    def "test1"() {
        expect:
        new Problem127().ladderLength("hit", "cog", ["hot", "dot", "dog", "lot", "log", "cog"]) == 5
    }

    @Unroll
    def "test2"() {
        expect:
        new Problem127().ladderLength("hit", "cog", ["hot","dot","dog","lot","log"]) == 0
    }

    @Unroll
    def "test3"() {
        expect:
        new Problem127().ladderLength("qa", "sq", ["si", "go", "se", "cm", "so", "ph", "mt", "db", "mb", "sb", "kr", "ln", "tm",
                                                   "le", "av", "sm", "ar", "ci", "ca", "br", "ti", "ba", "to", "ra", "fa", "yo",
                                                   "ow", "sn", "ya", "cr", "po", "fe", "ho", "ma", "re", "or", "rn", "au", "ur",
                                                   "rh", "sr", "tc", "lt", "lo", "as", "fr", "nb", "yb", "if", "pb", "ge", "th",
                                                   "pm", "rb", "sh", "co", "ga", "li", "ha", "hz", "no", "bi", "di", "hi", "qa",
                                                   "pi", "os", "uh", "wm", "an", "me", "mo", "na", "la", "st", "er", "sc", "ne",
                                                   "mn", "mi", "am", "ex", "pt", "io", "be", "fm", "ta", "tb", "ni", "mr", "pa",
                                                   "he", "lr", "sq", "ye"]) == 4
    }
}
