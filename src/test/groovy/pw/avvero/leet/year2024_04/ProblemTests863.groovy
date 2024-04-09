package pw.avvero.leet.year2024_04

import pw.avvero.leet.year2024_04.Problem863.TreeNode
import spock.lang.Specification
import spock.lang.Unroll

class ProblemTests863 extends Specification {

    @Unroll
    def "test"() {
        when:
        def target = new TreeNode(5)
        def root = new TreeNode(3, target, new TreeNode(1))
        then:
        new Problem863().distanceK(root, target, 2) == [1]
    }

}
