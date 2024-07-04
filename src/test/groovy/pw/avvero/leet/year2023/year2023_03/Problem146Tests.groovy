package pw.avvero.leet.year2023.year2023_03


import pw.avvero.leet.year2023.year2023_03.Problem146
import spock.lang.Specification
import spock.lang.Unroll

class Problem146Tests extends Specification {

    @Unroll
    def "test"() {
        when:
        def cache = new Problem146.LRUCache(2)
        cache.put(1, 1)
        cache.put(2, 2)
        cache.put(3, 3)
        then:
        cache.get(1) == -1
    }

}
