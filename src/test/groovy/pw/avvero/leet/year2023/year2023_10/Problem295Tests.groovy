package pw.avvero.leet.year2023.year2023_10

import pw.avvero.leet.year2023.year2023_10.Problem295
import spock.lang.Specification
import spock.lang.Unroll

class Problem295Tests extends Specification {

    @Unroll
    def "test1"() {
        when:
        def finder = new Problem295.MedianFinder()
        then:
        finder.addNum(6)
        finder.findMedian() == 6
        finder.addNum(10)
        finder.findMedian() == 8
        finder.addNum(2)
        finder.findMedian() == 6
        finder.addNum(6)
        finder.findMedian() == 6
        finder.addNum(5)
        finder.findMedian() == 6
        finder.addNum(0)
        finder.findMedian() == 5.5 as double
        finder.addNum(6)
        finder.findMedian() == 6
        finder.addNum(3)
        finder.findMedian() == 5.5 as double
        finder.addNum(1)
        finder.findMedian() == 5
        finder.addNum(0)
        finder.findMedian() == 4
        finder.addNum(0)
        finder.findMedian() == 3
    }


}
