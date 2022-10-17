package pw.avvero.ctci.chapter4

import spock.lang.Specification
import spock.lang.Unroll

class Chapter4Ex8Tests extends Specification {

    @Unroll
    def "Is subtree - #isSubTree"() {
        when:
        def tree = TreeBuilder.fromOrderedList([1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20] as Integer[])
        println tree.prettyPrint()
        println subTree.prettyPrint()
        then:
        SubtreeChecker.isSubTree(tree, subTree) == isSubTree
        where:
        isSubTree || subTree
        true      || TreeBuilder.fromOrderedList([1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20] as Integer[])
        false     || TreeBuilder.fromOrderedList([1, 2, 3] as Integer[])
        true      || TreeBuilder.fromOrderedList([1, 2, 3, 4] as Integer[])
        true      || TreeBuilder.fromOrderedList([1, 2, 3, 4, 5, 6, 7, 8, 9] as Integer[])
        false     || TreeBuilder.fromOrderedList([1, 2, 3, 4, 5, 6, 7, 8, 10] as Integer[])
        false     || TreeBuilder.fromOrderedList([1, 2, 3, 4, 5, 10, 7, 8, 9] as Integer[])
    }


}
