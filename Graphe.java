/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp04;

import java.util.LinkedList;
import java.util.Scanner;
import tp04.Sommet;

/**
 *
 * @author asus
 */
public class Graphe {
    
    private LinkedList<Sommet> liste;
    
    public Graphe(){
        liste = new LinkedList<Sommet>();
    }
    public void ajouter(Sommet s){
        liste.add(s);
    }
    public Sommet get(int index){
        return liste.get(index);
    } 
    public int getIndex(Sommet s){
        for(int i = 0 ; i <liste.size();i++){
          if(liste.get(i).getNom()==s.getNom()){
              return i;
          }  
        }
        return -1;
    }
    public int size(){
        return liste.size();
    }
    public Sommet getSommetParNom(String nom){
        for(Sommet s : liste){
            if(s.getNom()==nom)
                return s;
        }
        return null;
    }
    public int gtCout(Sommet s1 , Sommet s2){
        return (s1.getCout(s2));
    }
    public void afficher(){
        for(Sommet s :liste){
            s.afficher();
        }System.out.println();
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
