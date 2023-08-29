package pw.avvero.leet.year2023_08


import spock.lang.Specification
import spock.lang.Unroll

class Problem124Tests extends Specification {

    @Unroll
    def "test"() {
        when:
        def node = new Problem124.TreeNode(-10, new Problem124.TreeNode(9), new Problem124.TreeNode(42))
        then:
        new Problem124().maxPathSum(node) == 42
    }
}
