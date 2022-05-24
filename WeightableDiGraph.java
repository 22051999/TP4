/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp04;
import tp04.DirectedEdges;
import java.util.*;

public class WeightableDiGraph {
    protected int V; // vertex 
    protected int E ; // edges
    protected ArrayList<DirectedEdges>[] adj;
    
    public WeightableDiGraph(int V){
        this.V = V;
        this.E = E;
        adj = (ArrayList<DirectedEdges>[]) new ArrayList[V];
        for(int v =0; v<V; v++){
            adj[v] = new ArrayList<DirectedEdges>();
        }
    }
    public int V(){
        return this.V;
    }
    public int E(){
        return this.E;
    }
    public void addEdge(int v, int w, int weight){
        this.E++;
        DirectedEdges item = new DirectedEdges(v, w , weight);
        adj[v].add(item);
        //edgeList.add(item);
    }
    public String toString(){
        StringBuilder s = new StringBuilder();
        String NEWLINE = System.getProperty("line.separator");
        s.append(V +" vertices , " + E + "edges " + NEWLINE);
        for(int v =0; v < V; v ++){
            s.append(String.format("%d: ", v));
            for(DirectedEdges e : adj[v]){
                s.append(e + " ");
            }
            s.append(NEWLINE);
        }
        
        return s.toString();
    }
    public Iterable<DirectedEdges> adj(int v){
        if(v < 0 || v >= V) throw new IndexOutOfBoundsException();
        return this.adj[v];
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
