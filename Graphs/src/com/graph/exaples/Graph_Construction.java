package com.graph.exaples;
import java.util.LinkedList;
import java.util.Stack;

@SuppressWarnings("unused")
public class Graph_Construction {
    private final int V;
    private int E;
    private LinkedList<Integer>[] adj;
    
	@SuppressWarnings("unchecked")
	public Graph_Construction(int V) {
        if (V < 0) { 
        	throw new IllegalArgumentException("Number of vertices must be nonnegative");
        }
        this.V = V;
        this.E = 0;
        adj = new LinkedList[V];
        for (int v = 0; v < V; v++) {
            adj[v] = new LinkedList<Integer>();
        }
    }

    public int V() {
        return V;
    }
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
    public String toString() {
    	
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
      
        Graph_Construction G = new Graph_Construction(7);
        G.addEdge(0,5);
        G.addEdge(4,3);
        G.addEdge(0,1);
        G.addEdge(6,4);
        G.addEdge(5,4);
        G.addEdge(0,2);
        G.addEdge(0,6);
        G.addEdge(5,3);
        System.out.println(G.toString());
        System.out.println(G);
    }

}
