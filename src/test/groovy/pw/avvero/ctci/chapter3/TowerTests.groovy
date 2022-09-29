package pw.avvero.ctci.chapter3

import spock.lang.Specification

class TowerTests extends Specification {

    def "Tower could be populated with entries"() {
        when:
        def tower = new Tower()
        tower.push(3)
        tower.push(2)
        tower.push(1)
        then:
        tower.toString() == '[1, 2, 3]'
    }

    def "Tower could be populated with entries in descending order only"() {
        when:
        def tower = new Tower()
        tower.push(3)
        tower.push(2)
        tower.push(1)
        then:
        tower.toString() == '[1, 2, 3]'
        when:
        tower.push(4)
        then:
        thrown(RuntimeException)
        and:
        tower.toString() == '[1, 2, 3]'
    }

}
