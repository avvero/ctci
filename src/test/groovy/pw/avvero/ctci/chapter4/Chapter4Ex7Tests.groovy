package pw.avvero.ctci.chapter4

import spock.lang.Specification
import spock.lang.Unroll

class Chapter4Ex7Tests extends Specification {

    @Unroll
    def "#first and #second have the same ancestor - #ancestor"() {
        when:
        def tree = TreeBuilder.fromOrderedList([1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20] as Integer[])
        println tree.prettyPrint()
        then:
        AncestorFinder.find(tree, first, second) == ancestor
        where:
        first | second || ancestor
        1     | 2      || 5
        1     | 3      || 2
        1     | 4      || 2
        1     | 7      || 5
        1     | 9      || 5
        4     | 11     || 10
        4     | 17     || 10
    }


}
