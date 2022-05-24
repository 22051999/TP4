/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp04;

import tp04.DirectedEdges;
import tp04.WeightableDiGraph;
import java.util.*;
import java.util.Scanner;

/**
 *
 * @author asus
 */
public class BellmanFord {
 public static long dist[];
 public static long prev[];
 public static LinkedList<DirectedEdges> edgesList = new LinkedList<DirectedEdges>();
    public static int BellmanFord(WeightableDiGraph g){
        Arrays.fill(dist, Long.MAX_VALUE);
        Arrays.fill(prev, -1);
        dist[0] =0;
        for(int i = 1 ; i < g.V() -1 ; i++){
            for(DirectedEdges e : g.adj(i)){
                if(dist[e.to()] > dist[e.from()] + e.weight()){
                    dist[e.to()] = dist[e.from()] + e.weight();
                    prev[e.to()] = e.to();
                }
            }
        }
        for(int i = 0;i< g.V(); i ++){
            for(DirectedEdges e : g.adj(i)){
                if(dist[e.to()] > dist[e.from()] + e.weight())
                    return 1;
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        int n, m, v, w, weight;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        dist = new long[n];
        prev = new long[n];
        WeightableDiGraph g = new WeightableDiGraph(n);
        for(int i = 0 ; i< m ; i++){
            v = sc.nextInt();
            w = sc.nextInt(); 
            weight = sc.nextInt();
            g.addEdge(v -1,w -1,weight);
        }
        System.out.println(BellmanFord(g));
    }
    
}
