package pw.avvero.leet.year2025_05

import pw.avvero.leet.year2025_04.Problem447
import spock.lang.Specification
import spock.lang.Unroll

class ProblemTests449 extends Specification {

    @Unroll
    def "test"() {
        when:
        def node = new Problem449.TreeNode(2)
        node.left = new Problem449.TreeNode(1)
        def codec = new Problem449.Codec()
        then:
        codec.serialize(node) == "1,2"
        when:
        def resultNode = codec.deserialize("1,2")
        then:
        resultNode.val == 2
        resultNode.left.val == 1
    }

}
