package pw.avvero.ctci.chapter4


import spock.lang.Specification
import spock.lang.Unroll

class Chapter4Ex4Tests extends Specification {

    @Unroll
    def "Tree layers for #tree = #layers"() {
        when:
        println tree.prettyPrint()
        then:
        TreeSlasher.getLayers(tree) == layers
        where:
        layers                               | tree
        [0: [5], 1: [3], 2: [1]]             | BinaryTree.of(5, 3, 1)
        [0: [5], 1: [3, 7], 2: [1, 4]]       | BinaryTree.of(5, 3, 1, 4, 7)
        [0: [5], 1: [3, 7], 2: [1, 4, 6, 8]] | BinaryTree.of(5, 3, 1, 4, 7, 6, 8)
    }

}
