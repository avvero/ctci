package pw.avvero.ctci.chapter4

import spock.lang.Specification
import spock.lang.Unroll

class Chapter4Ex9Tests extends Specification {

    @Unroll
    def "For sum #sum there is a path: #paths"() {
        when:
        def tree = TreeBuilder.fromOrderedList([1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20] as Integer[])
        println tree.prettyPrint()
        then:
        SumPathFinder.find(tree, sum) == paths
        where:
        sum || paths
        1   || ["1"]
        13  || ["1 -> 2 -> 10", "3 -> 10", "8 -> 5", "6 -> 7", "13"]
        15  || ["3 -> 2 -> 10", "5 -> 10", "8 -> 7", "15"]
        30  || ["8 -> 7 -> 5 -> 10", "20 -> 10"]
        62  || ["19 -> 18 -> 15 -> 10"]
    }


}
