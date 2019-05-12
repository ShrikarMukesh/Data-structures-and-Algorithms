package com.digraph;
import java.util.LinkedList;
import java.util.Stack;

public class Digraph {
	private final int V;
	private int E;
	private LinkedList<Integer>[] adj;

	@SuppressWarnings("unchecked")
	public Digraph(int V) {
		if (V < 0) throw new IllegalArgumentException("Number of vertices in a Digraph must be nonnegative");
		this.V = V;
		this.E = 0;
		adj = (LinkedList<Integer>[]) new LinkedList[V];
		for (int v = 0; v < V; v++) {
			adj[v] = new LinkedList<Integer>();
		}
	}

	public Digraph(Digraph G) {
		
		this(G.V());
		this.E = G.E();
		for (int v = 0; v < G.V(); v++) {
			// reverse so that adjacency list is in same order as original
			Stack<Integer> reverse = new Stack<Integer>();
			for (int w : G.adj[v]) {
				reverse.push(w);
			}
			for (int w : reverse) {
				adj[v].add(w);
			}
		}
	}
	public int V() {
		return V;
	}

	public int E() {
		return E;
	}

	public void addEdge(int v, int w) {
		if (v < 0 || v >= V) throw new IndexOutOfBoundsException("vertex " + v + " is not between 0 and " + (V-1));
		if (w < 0 || w >= V) throw new IndexOutOfBoundsException("vertex " + w + " is not between 0 and " + (V-1));
		adj[v].add(w);
		E++;
	}

	public Iterable<Integer> adj(int v) {
		if (v < 0 || v >= V) throw new IndexOutOfBoundsException();
		return adj[v];
	}

	public Digraph reverse() {
		Digraph R = new Digraph(V);
		for (int v = 0; v < V; v++) {
			for (int w : adj(v)) {
				R.addEdge(w, v);
			}
		}
		return R;
	}

	public String toString() {
		StringBuilder s = new StringBuilder();
		String NEWLINE = System.getProperty("line.separator");
		s.append(V + " vertices, " + E + " edges " + NEWLINE);
		for (int v = 0; v < V; v++) {
			s.append(String.format("%d: ", v));
			for (int w : adj[v]) {
				s.append(String.format("%d ", w));
			}
			s.append(NEWLINE);
		}
		return s.toString();
	}

	public static void main(String[] args) {

		Digraph G = new Digraph(13);
		G.addEdge(4, 2);
		G.addEdge(2, 3);
		G.addEdge(3, 2);
		G.addEdge(6, 0);
		G.addEdge(0, 1);
		G.addEdge(2, 0);
		G.addEdge(11, 12);
		G.addEdge(12, 9);
		G.addEdge(9, 10);
		G.addEdge(9, 11);
		G.addEdge(8, 9);
		G.addEdge(10, 12);
		G.addEdge(11, 4);
		G.addEdge(4, 3);
		G.addEdge(3, 5);
		G.addEdge(7, 8);
		G.addEdge(8, 7);
		G.addEdge(5, 4);
		G.addEdge(0, 5);
		G.addEdge(6, 4);
		G.addEdge(6, 9);
		G.addEdge(7, 6);
		System.out.println(G);
		//G.reverse();
		//G.toString();
		
	}
}