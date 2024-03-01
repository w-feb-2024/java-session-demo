package graph;

public class Demo {

	public static void main(String[] args) {
		MyGraph graph = new MyGraph();
		graph.addVertex("Bob");
		graph.addVertex("Alice");
		graph.addVertex("Mark");
		graph.addVertex("Rob");
		graph.addVertex("Maria");
		
		graph.addEdge("Bob", "Alice");
		graph.addEdge("Bob", "Rob");
		graph.addEdge("Alice", "Mark");
		graph.addEdge("Rob", "Mark");
		graph.addEdge("Alice", "Maria");
		graph.addEdge("Rob", "Maria");
		
		System.out.println(graph.getAllAdjacentVertex("Bob"));
		
		System.out.println("DFS : " + graph.depthFirstTraversal(graph, "Bob"));
		
		System.out.println("BFS : " + graph.breadthFirstTraversal(graph, "Bob"));
	}

}
