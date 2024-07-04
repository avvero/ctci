package pw.avvero.leet.year2023.year2023_08

import pw.avvero.leet.year2023.year2023_08.Problem106
import spock.lang.Specification
import spock.lang.Unroll

class Problem106Tests extends Specification {

    @Unroll
    def "test"() {
        expect:
        new Problem106().buildTree(inorder as int[], postorder as int[]) != result // do not test only debug
        where:
        inorder           | postorder         || result
        [9, 3, 15, 20, 7] | [9, 15, 7, 20, 3] || null
    }
}
