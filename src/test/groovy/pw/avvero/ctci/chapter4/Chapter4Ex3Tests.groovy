package pw.avvero.ctci.chapter4


import spock.lang.Specification
import spock.lang.Unroll

class Chapter4Ex3Tests extends Specification {

    @Unroll
    def "Tree from #list is #treeString"() {
        when:
        def tree = TreeBuilder.fromOrderedList(list as Integer[])
        println tree.prettyPrint()
        then:
        tree.toString() == treeString
        where:
        list                            | treeString
        [1]                             | '[_, 1, _]'
        [1, 2, 3]                       | '[[_, 1, _], 2, [_, 3, _]]'
        [1, 2, 3, 4, 5]                 | '[[_, 1, [_, 2, _]], 3, [_, 4, [_, 5, _]]]'
        [1, 2, 3, 4, 5, 7, 8]           | '[[[_, 1, _], 2, [_, 3, _]], 4, [[_, 5, _], 7, [_, 8, _]]]'
        [1, 2, 3, 4, 5, 6, 7, 8, 9, 10] | '[[[_, 1, _], 2, [_, 3, [_, 4, _]]], 5, [[_, 6, [_, 7, _]], 8, [_, 9, [_, 10, _]]]]'
    }


}
