package pw.avvero.ctci.chapter4

import spock.lang.Specification

class TreeTests extends Specification {

    def "Tree tests"() {
        when:
        def tree = Tree.of(5, 3, 1, 4, 7, 6, 8)
        println tree.prettyPrint()
        then:
        tree.toString() == '[[[_, 1, _], 3, [_, 4, _]], 5, [[_, 6, _], 7, [_, 8, _]]]'
    }

    def "Tree tests 2"() {
        when:
        def tree = Tree.of(1, 2, 3, 4, 5, 6, 7)
        println tree.prettyPrint()
        then:
        tree.toString() == '[_, 1, [_, 2, [_, 3, [_, 4, [_, 5, [_, 6, [_, 7, _]]]]]]]'
    }

}
