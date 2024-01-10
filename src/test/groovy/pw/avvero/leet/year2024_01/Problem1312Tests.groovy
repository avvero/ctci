package pw.avvero.leet.year2024_01


import spock.lang.Specification
import spock.lang.Unroll

class Problem1312Tests extends Specification {

    @Unroll
    def "test"() {
        expect:
        new Problem1312().minInsertions(s) == result
        where:
        s          || result
        "mbadm"    || 2
        "leetcode" || 5
        "zzazz"    || 0
    }

}
