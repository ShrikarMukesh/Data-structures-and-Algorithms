package com.graph.exaples;

import java.util.*;
class Graph1{
	
	int vertex;
	int edges;
	LinkedList<Integer> adj[] ;
	public int getVertex() {
		return vertex;
	}
	public void setVertex(int vertex) {
		this.vertex = vertex;
	}
	public int getEdges() {
		return edges;
	}
	public void setEdges(int edges) {
		this.edges = edges;
	}
	public LinkedList<Integer>[] getAdj() {
		return adj;
	}
	public void setAdj(LinkedList<Integer>[] adj) {
		this.adj = adj;
	}
	
	@SuppressWarnings("unchecked")
	Graph1(int v){
		
		this.vertex=v;
		this.edges=0;
		adj = new LinkedList[v];
		for(int i =0;i<v;i++) {
			adj[i] = new LinkedList<>();
		}
	}
	
	void addEdge(int v,int w) {
		adj[v].addFirst(w);
        adj[w].addFirst(v);
	}
	void printGraph(Graph1 graph){       
		for(int v = 0; v < graph.vertex; v++)
        {
            System.out.println("Adjacency list of vertex "+ v);
            System.out.print("head");
            for(Integer pCrawl: graph.adj[v]){
                System.out.print(" -> "+pCrawl);
            }
            System.out.println("\n");
        }
	} 
	// A function used by DFS
    void DFSUtil(int v,boolean visited[]){
        // Mark the current node as visited and print it
        visited[v] = true;
        System.out.print(v+" ");
 
        // Recur for all the vertices adjacent to this vertex
        Iterator<Integer> i = adj[v].listIterator();
        while (i.hasNext()){
            int n = i.next();
            if (!visited[n])
                DFSUtil(n, visited);
        }
    }
    // The function to do DFS traversal. It uses recursive DFSUtil()
    void dfs(int v){
        // Mark all the vertices as not visited(set as
        // false by default in java)
        boolean visited[] = new boolean[v];
        // Call the recursive helper function to print DFS traversal
        DFSUtil(v, visited);
    }
}
class Graph_Construction2 {
   public static void main(String[] args) {
	  Graph1 g = new Graph1(3);
	  g.addEdge(0, 1);
	  g.addEdge(0, 2);
	  g.printGraph(g);
	  
   }
}
