package book.sedgewick.exaples;

import java.util.LinkedList;
public class Practice {
	
	int V ;
	int E;
	LinkedList<Integer>[] adj;
	
	@SuppressWarnings("unchecked")
	public Practice(int V) {
		
		 this.V=V;
		 this.E=0;
		 adj = (LinkedList<Integer>[]) new LinkedList[V];
		 for(int v=0;v<V;v++) {
			 adj[v]= new LinkedList<Integer>();
		 }
		 
	}
	public void addEdge(int v,int w) {
		if( v<0 || v >=V )throw new IndexOutOfBoundsException();
		if(w<0 || w >=V)throw new IndexOutOfBoundsException();
		E++;
		adj[v].add(w);
		adj[w].add(v);
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
		Practice G = new Practice(7);
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
