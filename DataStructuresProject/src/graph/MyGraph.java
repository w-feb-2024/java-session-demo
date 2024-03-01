package graph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;

public class MyGraph {
	// MyGraph is represented using adjacency list
	// for adjacency matrix we will use a HashMap
	private Map<Vertex, List<Vertex>> adjList;
	
	public MyGraph() {
		adjList = new HashMap<>();
	}
	// to construct the graph, we have to add vertices and edges
	// a vertex
	// add bob
	public void addVertex(String label) {
		adjList.putIfAbsent(new Vertex(label), new ArrayList<>());
	}
	
	// add an edge
	// edge for Bob: Bob-Alice, Bob-Rob
	// for Bob add Alice as adjcent vertex
	// likewise for Alice add Bob as adjacent vertex
	public void addEdge(String label1, String label2) {
		Vertex v1 = new Vertex(label1);
		Vertex v2 = new Vertex(label2);
		adjList.get(v1).add(v2);
		adjList.get(v2).add(v1);
	}
	
	// remove a vertex
	void removeVertex(String label) {
        Vertex v = new Vertex(label);
        adjList.values().stream().forEach(e -> e.remove(v));
        adjList.remove(new Vertex(label));
    }
	
	// remove an edge
	void removeEdge(String label1, String label2) {
        Vertex v1 = new Vertex(label1);
        Vertex v2 = new Vertex(label2);
        List<Vertex> eV1 = adjList.get(v1);
        List<Vertex> eV2 = adjList.get(v2);
        if (eV1 != null)
            eV1.remove(v2);
        if (eV2 != null)
            eV2.remove(v1);
    }
    
	// get all adjacent vertices
	List<Vertex> getAllAdjacentVertex(String label){
		return adjList.get(new Vertex(label));
	}
	
	// 2 types of traversals
	// Depth First Search/Traversal
	public Set<String> depthFirstTraversal(MyGraph graph, String startVertex){
		// a Set to keep track of the visited vertices
		Set<String> visited = new LinkedHashSet<>();
		// a Stack to push all the adjacent vertices as we visit each vertex
		Stack<String> stack = new Stack<>();
		
		stack.push(startVertex);
		while(!stack.isEmpty()) {
			String vertex = stack.pop();
			if(!visited.contains(vertex)) {
				visited.add(vertex);
				for(Vertex eachAdjVertex: graph.getAllAdjacentVertex(vertex)) {
					stack.push(eachAdjVertex.getLabel());
				}
			}
		}
		return visited;
	}
	
	// Breadth First Search/Traversal
	public Set<String> breadthFirstTraversal(MyGraph graph, String startVertex){
		// a Set to keep track of the visited vertices
		Set<String> visited = new LinkedHashSet<>();
		// a Queue to add all the adjacent vertices as we visit each vertex
		Queue<String> queue = new LinkedList<>();
		
		queue.add(startVertex);
		visited.add(startVertex); // missed this line during the session
		while(!queue.isEmpty()) {
			String vertex = queue.poll();
			for(Vertex eachAdjVertex: graph.getAllAdjacentVertex(vertex)) {
				if(!visited.contains(eachAdjVertex.getLabel())) {
					visited.add(eachAdjVertex.getLabel());
					queue.add(eachAdjVertex.getLabel());
				}
			}
		}
		return visited;
	}
	
}
