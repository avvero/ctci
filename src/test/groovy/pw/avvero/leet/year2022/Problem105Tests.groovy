package pw.avvero.leet.year2022

import pw.avvero.leet.year2022.Problem105
import spock.lang.Specification
import spock.lang.Unroll

class Problem105Tests extends Specification {

    @Unroll
    def "test"() {
        expect:
        new Problem105().buildTree(preorder as int[], inorder as int[]) == result
        where:
        preorder          | inorder           || result
        [3, 9, 20, 15, 7] | [9, 3, 15, 20, 7] || null
//        [1, 2]            | [1, 2]            || null
//        [1, 2, 3]         | [2, 3, 1]         || null // [1,2,null,null,3]
    }

}
