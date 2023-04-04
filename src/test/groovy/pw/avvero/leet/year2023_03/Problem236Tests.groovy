package pw.avvero.leet.year2023_03

import spock.lang.Specification
import spock.lang.Unroll

import pw.avvero.leet.year2023_03.Problem236.TreeNode

class Problem236Tests extends Specification {

    @Unroll
    def "test"() {
        when:
        def root = new TreeNode(3)
        def node5 = new TreeNode(5)
        def node6 = new TreeNode(6)
        node5.left = node6
        def node2 = new TreeNode(2)
        node5.right = node2
        def node7 = new TreeNode(7)
        def node4 = new TreeNode(4)
        node2.left = node7
        node2.right = node4
        root.left = node5
        //
        def node1 = new TreeNode(1)
        root.right = node1
        def node0 = new TreeNode(0)
        node1.left = node0
        def node8 = new TreeNode(8)
        node1.right = node8
        then:
        new Problem236().lowestCommonAncestor(root, node5, node4)?.val == 5
    }
}
