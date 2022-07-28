package com.graph.exaples;
class DepthFirstSearch {
	
    private boolean[] marked;    // marked[v] = is there an s-v path?
    private int count;           // number of vertices connected to s
    public DepthFirstSearch(Graph_Construction G, int s) {
        marked = new boolean[G.V()];
        dfs(G, s);
    }
    // depth first search from v
    private void dfs(Graph_Construction G, int v) {
        count++;
        marked[v] = true;
        for (int w : G.adj(v)) {
            if (!marked[w]) {
                dfs(G, w);
            }
        }
    }
    public boolean marked(int v) {
        return marked[v];
    }
    public int count() {
        return count;
    }
    public static void main(String[] args) {
       
    	Graph_Construction G = new Graph_Construction(13);
        G.addEdge(0,5); G.addEdge(4,3);
        G.addEdge(0,1); G.addEdge(9,12);
        G.addEdge(6,4);
        G.addEdge(5,4);
        G.addEdge(0,2);
        G.addEdge(9,10);
        G.addEdge(11,12);
        G.addEdge(0,6);
        G.addEdge(7,8);
        G.addEdge(9,11);
        G.addEdge(5,3);
        DepthFirstSearch search = new DepthFirstSearch(G, 0);
        for (int v = 0; v < G.V(); v++) {
            if (search.marked(v))
                System.out.print(v + " ");
        }
        System.out.println();
        if (search.count() != G.V()) {
        	System.out.println("NOT connected");
        }else {                     
        	System.out.println("connected");
        }
    }

}
