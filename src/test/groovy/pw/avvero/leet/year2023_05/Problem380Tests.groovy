package pw.avvero.leet.year2023_05


import spock.lang.Specification
import spock.lang.Unroll

class Problem380Tests extends Specification {

    @Unroll
    def "test"() {
        setup:
        def set = new Problem380.RandomizedSet()
        expect:
        set.insert(0) == true
        set.insert(1) == true
        set.remove(0) == true
        set.insert(2) == true
        set.remove(1) == true
        set.getRandom() < 3
    }

    @Unroll
    def "test2"() {
        setup:
        def set = new Problem380.RandomizedSet()
        expect:
        set.remove(0) == false
        set.remove(0) == false
        set.insert(0) == true
//        set.getRandom() == 1
        set.remove(0) == true
        set.insert(0) == true
    }
}
