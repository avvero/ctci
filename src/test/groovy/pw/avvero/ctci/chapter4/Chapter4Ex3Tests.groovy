package pw.avvero.ctci.chapter4


import spock.lang.Specification
import spock.lang.Unroll

class Chapter4Ex3Tests extends Specification {

    @Unroll
    def "Tree from #list is #treeString"() {
        when:
        def tree = TreeBuilder.fromOrderedList(list)
        println tree.prettyPrint()
        then:
        tree.toString() == treeString
        where:
        list      | treeString
        [1]       | '[_, 1, _]'
        [1, 2, 3] | '[[_, 1, _], 2, [_, 3, _]]'
    }


}
