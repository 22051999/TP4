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
public class TP04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Graphe gr = new Graphe();
       Sommet a = new Sommet ("USD");
       Sommet b = new Sommet ("GBP");
       Sommet c = new Sommet ("CHF");
       Sommet d = new Sommet ("EUR");
       Sommet e = new Sommet ("CAD");
       
       a.convert();
       b.convert();
       a.ajouterVoisin(e, 8);
       b.ajouterVoisin(d, 2);
       c.ajouterVoisin(b, 5);
       d.ajouterVoisin(a, 3);
       e.ajouterVoisin(c, 11);
      
       
       
       
       
       gr.ajouter(a);
       gr.ajouter(b);
       gr.ajouter(c);
       gr.ajouter(d);
       gr.ajouter(e);
       
       
       gr.afficher();
    }
    
    
}
