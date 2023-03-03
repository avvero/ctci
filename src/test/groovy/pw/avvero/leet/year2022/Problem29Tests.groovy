package pw.avvero.leet.year2022

import pw.avvero.leet.year2022.Problem29
import spock.lang.Specification
import spock.lang.Unroll

class Problem29Tests extends Specification {

    @Unroll
    def "test"() {
        expect:
        new Problem29().divide(dividend as int, divisor as int) == result
        where:
        dividend    | divisor     || result
//        10          | 3           || 3
//        7           | -3          || -2
//        -2147483648 | -3          || 715827882
//        -1021989372 | -82778243   || 12
//        1225415774  | -147211203  || -8
        -2147483648 | -1109186033 || 1
    }

    //1225415774
    //147211203
    //831582400

    //393833374
}
