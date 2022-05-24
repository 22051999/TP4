/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp04;

/**
 *
 * @author asus
 */
public class DirectedEdges {
    protected int v ;
    protected int w ; //edge 
    protected int weight;// weight 
    
    public DirectedEdges(int v, int w , int  weight){
        this.v = v;
        this.w = w;
        this.weight = weight;
    }
    public int from (){
        return v;
    }
    public int to(){
        return w;
    }
    public int weight(){
        return weight ;
    }
    public String toString(){
        return v + "->" + w + " " + String.format("%d", weight);
    }
    
    
    
    
    
    
    
    
    
    
    
    
}
