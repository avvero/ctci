package pw.avvero.leet.year2026_02


import spock.lang.Specification
import spock.lang.Unroll

class ProblemTests707 extends Specification {

    @Unroll
    def "test"() {
        expect:
        var list5 = new Problem707.MyLinkedList()
        list5.addAtHead(4)
        list5.get(1)
        list5.addAtHead(1)
        list5.addAtHead(5)
        list5.deleteAtIndex(3)
        list5.addAtHead(7)
        list5.get(3)
        list5.get(3)
        list5.get(3)
        list5.addAtHead(1)
        list5.deleteAtIndex(4)


        var list4 = new Problem707.MyLinkedList()
        list4.addAtHead(2)
        list4.size == 1
        list4.deleteAtIndex(1)
        list4.size == 1
        list4.addAtHead(2)
        list4.size == 2
        list4.addAtHead(7)
        list4.size == 3
        list4.addAtHead(3)
        list4.size == 4
        list4.addAtHead(2)
        list4.size == 5
        list4.addAtHead(5)
        list4.size == 6
        list4.addAtTail(5)
        list4.size == 7
        list4.get(5)
        list4.deleteAtIndex(6)
        list4.deleteAtIndex(4)

        var list3 = new Problem707.MyLinkedList()
        list3.addAtHead(7)
        list3.addAtHead(2)
        list3.addAtHead(1)
        list3.addAtIndex(3, 0)
        list3.deleteAtIndex(2)
        list3.addAtHead(6)
        list3.addAtTail(4)
        list3.get(4) == 4


        var list2 = new Problem707.MyLinkedList()
        list2.addAtHead(1)
        list2.deleteAtIndex(0)

        var list = new Problem707.MyLinkedList()
        list.addAtHead(1)
        list.addAtTail(3)
        list.addAtIndex(1, 2)
        list.get(1) == 2
        list.deleteAtIndex(1)
        list.get(1) == 3
    }

}
