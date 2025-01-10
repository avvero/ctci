package pw.avvero.leet.year2024.year2024_01

import pw.avvero.leet.year2024.year2024_01.Problem1312
import spock.lang.Specification
import spock.lang.Unroll

class Problem1312Tests extends Specification {

    @Unroll
    def "test"() {
        expect:
        new Problem1312().minInsertions(s) == result
        where:
        s          || result
        "eetcode"  || 4
        "leetcode" || 5
        "mbadm"    || 2
        "zzazz"    || 0
    }

}
