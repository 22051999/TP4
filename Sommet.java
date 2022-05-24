/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp04;

import java.util.LinkedList;
import java.util.Scanner;

public class Sommet {
     int choixListe;
       Double taux ;
       String chaine;
    private String nom ;
    private boolean marque = false;
    private LinkedList<Sommet> voisins;
    private LinkedList<Integer> couts;
    
    public Sommet(String nom){
        voisins = new LinkedList<Sommet>();
        couts = new LinkedList<Integer>();
        this.nom = nom;
    }
    public void ajouterVoisin(Sommet s, int c){
        voisins.add(s);
        couts.add(c);
    }
    public String getNom(){
        return nom;
    }
    public void marquer() {
        marque = true;
    }
    public boolean etat(){
        return marque;
    }
    public int getCout(Sommet s ){
        for(int i = 0; i<voisins.size(); i++){
            if(s==voisins.get(i)){
                return couts.get(i);
            }
        }
        return -1;
    }
    public LinkedList<Sommet> getVoisins(){
        return voisins ;
    }
    public void afficher(){
        System.out.print(getNom()+":");
        for(Sommet s : voisins){
            System.out.print(s.getNom()+"\n");
        }
    }
     public void  convert()
       {
            Scanner sc = new Scanner(System.in);
        if (choixListe == 0) {
          /*Si aucun choix dans la liste des monnaies*/
          
        }
        else if (choixListe == 1) {
          /*Si on choisit de convertir */
          
          try {
            /*On convertit le chiffre saisie*/
            Float intermediaire = java.lang.Float.valueOf(chaine);
            Double resultatConvert = intermediaire.doubleValue();
            /*On divise le chiffre par le taux de mannai/
            taux = sc.nextDouble();
            resultatConvert /= taux;
            /*On affiche le resultat*/
            
          }
          catch (Exception e) {
            
          }
        }
        else if (choixListe == 2) 
        {
          /*Si on choisit de convertir en l'inverce*/
         
          try 
          {
            /*On convertit le chiffre saisie*/
            Float intermediaire = java.lang.Float.valueOf(chaine);
            Double resultatConvert = intermediaire.doubleValue();
            /*On multiplie le chiffre par le taux de */
            taux = sc.nextDouble();
            resultatConvert = sc.nextDouble();
            resultatConvert *= taux;
            /*On affiche le resultat*/
            
          }
          catch (Exception e) 
          {
           System.out.println("Erreur_" + e.getMessage());
          }
        }
        else {
          System.out.println("Erreur_");
        }
      
       }
    
    
    
    
    
    
    
    
    
    
   
}
