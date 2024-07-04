package pw.avvero.leet.year2023.year2023_03

import pw.avvero.leet.year2023.year2023_03.Problem160
import spock.lang.Specification
import spock.lang.Unroll
import static pw.avvero.leet.year2023.year2023_03.Problem160.ListNode

class Problem160Tests extends Specification {

    @Unroll
    def "test"() {
        when:
        def node1 = new ListNode(1)
        def node9 = new ListNode(9)
        node1.next = node9
        def node1_2 = new ListNode(1)
        node9.next = node1_2
        def node3 = new ListNode(3)
        def node2 = new ListNode(2)
        node1_2.next = node2
        node3.next = node2
        def node4 = new ListNode(4)
        node2.next = node4
        then:
        new Problem160().getIntersectionNode(node1, node3).val == 2
    }
}
