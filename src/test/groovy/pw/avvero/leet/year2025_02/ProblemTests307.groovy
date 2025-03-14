package pw.avvero.leet.year2025_02


import spock.lang.Specification
import spock.lang.Unroll

class ProblemTests307 extends Specification {

    @Unroll
    def "test"() {
        expect:
        Problem307 numArray = new Problem307([1, 3, 5] as int[]);
        numArray.sumRange(0, 2) == 9  // return 1 + 3 + 5 = 9
        numArray.update(1, 2);       // nums = [1, 2, 5]
        numArray.sumRange(0, 2) == 8; // return 1 + 2 + 5 = 8
    }

    @Unroll
    def "test2"() {
        expect:
        Problem307 numArray = new Problem307([9, -8] as int[]);
        numArray.update(0, 3);
        numArray.sumRange(1, 1) == -8
        numArray.sumRange(0,1) == 3
        numArray.update(1,-3)
        numArray.sumRange(0,1) == 0
    }

}
