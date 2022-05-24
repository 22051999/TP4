/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp04;

import java.util.*;
/**
 *
 * @author asus
 */
public class Converss 
{
      int choixListe;
       Double taux ;
       String chaine;
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
