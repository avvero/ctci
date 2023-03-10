package pw.avvero.leet.year2023_03


import spock.lang.Specification
import spock.lang.Unroll

class Problem155Tests extends Specification {

    @Unroll
    def "test"() {
        when:
        def stack = new Problem155.MinStack()
        stack.push(-2)
        stack.push(0)
        stack.push(-1)
        then:
        stack.getMin() == -2
    }
}
