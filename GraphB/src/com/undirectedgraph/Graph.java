package com.undirectedgraph;

import java.util.LinkedList;
import java.util.Stack;

public class Graph {
	private final int V;
	private int E;
	private LinkedList<Integer>[] adj;
	
	@SuppressWarnings("unchecked")
	public Graph(int V) {
		if (V < 0) throw new IllegalArgumentException("Number of vertices must be nonnegative");
		this.V = V;
		this.E = 0;
		adj = (LinkedList<Integer>[]) new LinkedList[V];
		for (int v = 0; v < V; v++) {
			adj[v] = new LinkedList<Integer>();
		}
	}

	public Graph(Graph G) {
		
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

	//Returns the number of vertices in the graph.
	public int V() {
		return V;
	}
	
	//Returns the number of edges in the graph.	
	public int E() {
		return E;
	}
	
	public void addEdge(int v, int w) {
		if (v < 0 || v >= V) throw new IndexOutOfBoundsException();
		if (w < 0 || w >= V) throw new IndexOutOfBoundsException();
		E++;
		adj[v].add(w);
		adj[w].add(v);
	}
	public Iterable<Integer> adj(int v) {
		if (v < 0 || v >= V) throw new IndexOutOfBoundsException();
		return adj[v];
	}
	public String printTheGraph() {
		StringBuilder s = new StringBuilder();
		String NEWLINE = System.getProperty("line.separator");
		s.append(V + " vertices, " + E + " edges " + NEWLINE);
		for (int v = 0; v < V; v++) {
			s.append(v + ": ");
			for (int w : adj[v]) {
				s.append(w + " ");
			}
			s.append(NEWLINE);
		}
		return s.toString();
	}
	public static void main(String[] args) {

		Graph G = new Graph(7);
		G.addEdge(0,5);
		G.addEdge(4,3);
		G.addEdge(0,1);
		G.addEdge(6,4);
		G.addEdge(5,4);
		G.addEdge(0,2);
		G.addEdge(0,6);
		G.addEdge(5,3);
		System.out.println(G.printTheGraph());
	}

}
