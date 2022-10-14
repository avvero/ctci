package pw.avvero.ctci.chapter4


import spock.lang.Specification
import spock.lang.Unroll

class Chapter4Ex6Tests extends Specification {

    @Unroll
    def "For #current next would be #next"() {
        when:
        def tree = TreeBuilder.fromOrderedList([1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20] as Integer[])
        println tree.prettyPrint()
        then:
        NextFinder.next(tree, current) == next
        where:
        current | next
        1       | 2
        3       | 4
        4       | 5
        5       | 6
        9       | 10
        14      | 15
    }


}
