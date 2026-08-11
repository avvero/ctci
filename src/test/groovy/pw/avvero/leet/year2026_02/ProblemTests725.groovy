package pw.avvero.leet.year2026_02


import spock.lang.Specification
import spock.lang.Unroll

class ProblemTests725 extends Specification {

    @Unroll
    def "test"() {
        when:
        def head = new Problem725.ListNode(1)
        head.next = new Problem725.ListNode(2)
        head.next.next = new Problem725.ListNode(3)
        head.next.next.next = new Problem725.ListNode(4)
        head.next.next.next.next = new Problem725.ListNode(5)
        and:
        def result = new Problem725().splitListToParts(head, 2)
        then:
        result != null
    }

}
