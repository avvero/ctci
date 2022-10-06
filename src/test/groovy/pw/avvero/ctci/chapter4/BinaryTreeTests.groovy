package pw.avvero.ctci.chapter4

import pw.avvero.ctci.chapter4.BinaryTree.Node
import spock.lang.Specification
import spock.lang.Unroll

class BinaryTreeTests extends Specification {

    @Unroll
    def "Tree is balanced = #balanced"() {
        when:
        println tree.prettyPrint()
        then:
        1 == 1
        where:
        balanced | tree
        true     | BinaryTree.of(5, 3, 1, 4, 7, 6, 8)
        false    | BinaryTree.of(1, 2, 3, 4, 5, 6, 7)
        false    | BinaryTree.of(new Node(new Node(new Node(3), 6, new Node(5)), 1, new Node(null, 3, new Node(7))))
        true     | BinaryTree.of(new Node(new Node(9), 3, new Node(new Node(15), 20, new Node(7))))
        false    | BinaryTree.of(new Node(new Node(new Node(new Node(4), 3, new Node(4)), 2, new Node(3)), 1, new Node(2)))
    }


}
