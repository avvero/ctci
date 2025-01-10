package pw.avvero.leet.year2025_01

import pw.avvero.leet.year2024.year2024_12.Problem43
import spock.lang.Specification
import spock.lang.Unroll

class ProblemTests147 extends Specification {

    @Unroll
    def "test"() {
        when:
        def head = new Problem147.ListNode(4, new Problem147.ListNode(2, new Problem147.ListNode(1, new Problem147.ListNode(3))))
        then:
        new Problem147().insertionSortList(head) != null
    }
}
