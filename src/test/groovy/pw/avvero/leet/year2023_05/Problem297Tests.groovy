package pw.avvero.leet.year2023_05


import spock.lang.Specification
import spock.lang.Unroll

class Problem297Tests extends Specification {

    @Unroll
    def "test"() {
        when:
        Problem297.Codec ser = new Problem297.Codec();
        Problem297.Codec deser = new Problem297.Codec();
        then:
        ser.serialize(deser.deserialize(node)) == node
        where:
        node                                                                                                           | _
        "[1,2,3,null,null,4,5]"                                                                                        | _
        "[]"                                                                                                           | _
        "[4,-7,-3,null,null,-9,-3,9,-7,-4,null,6,null,-6,-6,null,null,0,6,5,null,9,null,null,-1,-4,null,null,null,-2]" | _
    }
}
