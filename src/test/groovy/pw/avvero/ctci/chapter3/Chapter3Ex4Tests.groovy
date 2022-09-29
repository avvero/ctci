package pw.avvero.ctci.chapter3


import spock.lang.Specification
import spock.lang.Unroll

class Chapter3Ex4Tests extends Specification {

    @Unroll
    def "1: Stack transfer implementation"() {
        when:
        def source = Stack.of(entries)
        def middle = new Stack()
        def target = new Stack()
        def transfer = new StackTransfer(source, middle, target)
        then:
        source.toString() == sourceString
        middle.toString() == '[]'
        target.toString() == '[]'
        when:
        transfer.process()
        then:
        source.toString() == '[]'
        middle.toString() == '[]'
        target.toString() == targetString
        where:
        entries         | sourceString || targetString
        []              | '[]'          | '[]'
        [1]             | '[1]'         | '[1]'
        [2, 1]          | '[2,1]'       | '[2,1]'
        [3, 2, 1]       | '[3,2,1]'     | '[3,2,1]'
        [4, 3, 2, 1]    | '[4,3,2,1]'   | '[4,3,2,1]'
        [5, 4, 3, 2, 1] | '[5,4,3,2,1]' | '[5,4,3,2,1]'
    }
}
