package pw.avvero.leet

import pw.avvero.leet.Problem98.TreeNode
import spock.lang.Specification
import spock.lang.Unroll

class Problem98Tests extends Specification {

    @Unroll
    def "test"() {
        expect:
        new Problem98().isValidBST(node) == result
        where:
        node                                                                                                                         || result
        // [2,1,3]
        new TreeNode(2, new TreeNode(1), new TreeNode(3))                                                                            || true
        // [5,4,6,null,null,3,7]
        new TreeNode(5, new TreeNode(4), new TreeNode(6, new TreeNode(3), new TreeNode(7)))                                          || false
        // [32,26,47,19,null,null,56,null,27]
        new TreeNode(32, new TreeNode(26, new TreeNode(19, null, new TreeNode(27)), null), new TreeNode(47, null, new TreeNode(56))) || false
        // [3,1,5,0,2,4,6]
        new TreeNode(3, new TreeNode(1, new TreeNode(0), new TreeNode(2)), new TreeNode(5, new TreeNode(4), new TreeNode(6)))        || true
        // [-2147483648,null,2147483647]
        new TreeNode(-2147483648, null, new TreeNode(2147483647))                                                                    || true
        // [10,5,15,null,null,-2147483648,20]
        new TreeNode(10, new TreeNode(5), new TreeNode(15, new TreeNode(-2147483648), new TreeNode(20)))                             || false
    }

}
