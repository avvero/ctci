package pw.avvero.ctci.chapter4

import pw.avvero.ctci.chapter4.BinaryTree.Node
import spock.lang.Specification
import spock.lang.Unroll

class Chapter4Ex5Tests extends Specification {

    @Unroll
    def "Tree is binary search = #binarySearch"() {
        when:
        println tree.prettyPrint()
        then:
        BinarySearchChecker.check(tree) == binarySearch
        where:
        binarySearch | tree
        true         | BinaryTree.of(5, 3, 7)
        true         | BinaryTree.of(5, 3, 1, 4, 7, 6, 8)
        true         | BinaryTree.of(5, 3, 1, 4, 7, 6, 2)
        true         | BinaryTree.of(1, 2, 3, 4, 5, 6, 7)
        false        | BinaryTree.of(new Node(new Node(new Node(3), 6, new Node(5)), 1, new Node(null, 3, new Node(7))))
        false        | BinaryTree.of(new Node(new Node(9), 3, new Node(new Node(15), 20, new Node(7))))
        false        | BinaryTree.of(new Node(new Node(new Node(new Node(4), 3, new Node(4)), 2, new Node(3)), 1, new Node(2)))
        true         | TreeBuilder.fromOrderedList([1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20] as Integer[])
        false        | BinaryTree.of(new Node(new Node(null, 10, new Node(25)), 20, new Node(30)))
    }


}
