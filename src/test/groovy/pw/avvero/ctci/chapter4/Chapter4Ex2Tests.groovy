package pw.avvero.ctci.chapter4


import pw.avvero.ctci.chapter4.Graph.Vertex
import spock.lang.Specification
import spock.lang.Unroll

class Chapter4Ex2Tests extends Specification {

    @Unroll
    def "Depth walker: There is a path between #start and #end: #pathExists"() {
        when:
        def graph = new Graph(vertices: [
                new Vertex(value: "A", nodes: ["B"]),
                new Vertex(value: "B", nodes: ["C"]),
                new Vertex(value: "C", nodes: ["E"]),
                new Vertex(value: "E", nodes: ["D", "F"]),
                new Vertex(value: "D", nodes: ["B"]),
        ])
        then:
        new GraphDepthWalker().pathExists(graph, start, end) == pathExists
        where:
        start | end || pathExists
        "A"   | "B" || true
        "B"   | "C" || true
        "A"   | "C" || true
        "A"   | "F" || true
        "A"   | "D" || true
        "D"   | "A" || false
        "E"   | "A" || false
        "F"   | "A" || false
        "F"   | "E" || false
    }

    @Unroll
    def "Breadth walker: There is a path between #start and #end: #pathExists"() {
        when:
        def graph = new Graph(vertices: [
                new Vertex(value: "A", nodes: ["B"]),
                new Vertex(value: "B", nodes: ["C"]),
                new Vertex(value: "C", nodes: ["E"]),
                new Vertex(value: "E", nodes: ["D", "F"]),
                new Vertex(value: "D", nodes: ["B"]),
        ])
        then:
        new GraphBreadthWalker().pathExists(graph, start, end) == pathExists
        where:
        start | end || pathExists
        "A"   | "B" || true
        "B"   | "C" || true
        "A"   | "C" || true
        "A"   | "F" || true
        "A"   | "D" || true
        "D"   | "A" || false
        "E"   | "A" || false
        "F"   | "A" || false
        "F"   | "E" || false
    }


}
