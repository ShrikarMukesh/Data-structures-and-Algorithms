package book.sedgewick.exaples;
import java.util.LinkedList;

public class Graph {
	private final int V; // number of vertices
	private int E; // number of edges
	private LinkedList<Integer>[] adj; // adjacency lists
	@SuppressWarnings("unchecked")
	public Graph(int V){

		this.V = V; this.E = 0;
		adj = (LinkedList<Integer>[]) new LinkedList[V]; // Create array of lists.
		for (int v = 0; v < V; v++) // Initialize all lists
			adj[v] = new LinkedList<Integer>(); // to empty.
	}
	public int V() {
		return V; 
	}
	public int E() {
		return E; 
	}
	public void addEdge(int v, int w){
		E++;
		adj[v].add(w); // Add w to v’s list.
		adj[w].add(v); // Add v to w’s list.

	}
	public Iterable<Integer> adj(int v){ 
		return adj[v]; 
	}
	//Print the graph
	public String printTheGraph(){
		String s = V + " vertices, " + E + " edges\n";
		for (int v = 0; v < V; v++)
		{
			s += v + ": ";
			for (int w : this.adj(v))
				s += w + " ";
			s += "\n";
		}
		return s;
	}
	//compute the degree of v
	@SuppressWarnings("unused")
	public static int degree(Graph G, int v){
		int degree = 0;
		for (int w : G.adj(v)) {
			degree++;
		}
		return degree;
	}
	public static int maxDegree(Graph G){
		int max = 0;
		for (int v = 0; v < G.V(); v++)
			if (degree(G, v) > max)
				max = degree(G, v);
		return max;
	}
	public static void main(String[] args) {
		
		Graph g = new Graph(4);
		g.addEdge(0, 2);
		g.addEdge(1, 2);
		g.addEdge(2, 3);
		g.addEdge(3, 1);
		System.out.println("The degree of the graph = "+Graph.degree(g, 2));
		System.out.println(g.printTheGraph());
		System.out.println(maxDegree(g));
	}
}