package com.graph.exaples;

import java.util.Stack;

public class DFSPaths {
     Graph1  G ;
     int s;
     int[] edgeTo;
     boolean[] marked;
     DFSPaths(Graph1 G,int s) {
	     marked = new boolean[G.getVertex()];
	     edgeTo= new int[G.getVertex()];
	 }
     boolean haspathTo(int v) {
		return false;
    	 
     }
     @SuppressWarnings("unchecked")
	Iterable<Integer> pathTo(int v){
    	 int i=0;
    	 if(!haspathTo(v)) {
    		 return null;
    	 }
    	 @SuppressWarnings("rawtypes")
		Stack st = new Stack<>();
    	 for(i = v;i!=s;i=edgeTo[i]) {
    		 st.push(i);
    	 }
    	 st.push(i);
    	 return st;
     }
}
