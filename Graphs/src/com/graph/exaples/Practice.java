package com.graph.exaples;

import java.util.LinkedList;

class Grp{

	 int V;
	 int E;
	LinkedList<Integer>[] grp ;

	@SuppressWarnings("unchecked")
	public Grp(int V) {
		this.V = V;
		this.E = 0;
		grp = new LinkedList[V];
		for(int v = 0;v<V; v++) {
			grp[v] = new LinkedList<Integer>();
		}
	}
	void addEdge(int v, int w) {
		E++;
		grp[v].add(w);
		grp[w].add(v);
	}
	public void printGraph(Grp graph){ 
		
		for(int v = 0; v < graph.V; v++)
        {
            System.out.println("Adjacency list of vertex "+ v);
            System.out.print("from vertex to  " +v);
            for(Integer pCrawl: graph.grp[v]){
                System.out.print(" -> "+pCrawl);
            }
            System.out.println("\n");
        }
	} 
}
public class Practice { 
	public static void main(String[] args) {
	  Grp g = new Grp(4);
	  g.addEdge(0, 1);
	  g.addEdge(1, 2);
	  g.addEdge(1, 3);
	  g.printGraph(g);
	  
	}
}
