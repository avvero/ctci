package pw.avvero.ctci.chapter3


import spock.lang.Specification
import spock.lang.Unroll

class Chapter3Ex4Tests extends Specification {

    @Unroll
    def "1: Stack transfer implementation"() {
        when:
        def source = Tower.of(entries)
        def middle = new Tower()
        def target = new Tower()
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
        entries         | sourceString     || targetString
        []              | '[]'              | '[]'
        [1]             | '[1]'             | '[1]'
        [2, 1]          | '[1, 2]'          | '[1, 2]'
        [3, 2, 1]       | '[1, 2, 3]'       | '[1, 2, 3]'
        [4, 3, 2, 1]    | '[1, 2, 3, 4]'    | '[1, 2, 3, 4]'
        [5, 4, 3, 2, 1] | '[1, 2, 3, 4, 5]' | '[1, 2, 3, 4, 5]'
    }
}
