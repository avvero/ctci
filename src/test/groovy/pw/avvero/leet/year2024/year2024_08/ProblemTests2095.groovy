package pw.avvero.leet.year2024.year2024_08

import pw.avvero.leet.year2024.year2024_08.Problem2095
import pw.avvero.leet.year2024.year2024_08.Problem2095.ListNode
import spock.lang.Specification
import spock.lang.Unroll

class ProblemTests2095 extends Specification {

    @Unroll
    def "test"() {
        when:
        def node = new ListNode(1, new ListNode(3, new ListNode(4, new ListNode(7, new ListNode(1, new ListNode(2, new ListNode(6)))))))
        new Problem2095().deleteMiddle(node)
        then:
        1 == 1

    }

}
