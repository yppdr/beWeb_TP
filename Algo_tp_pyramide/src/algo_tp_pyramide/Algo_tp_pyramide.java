/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algo_tp_pyramide;

import java.util.Scanner;

/**
 *
 * @author yannis
 */
public class Algo_tp_pyramide {

    /**
     * @param args the command line arguments
     */
    public static void pyramide(int n){
        /**
         * NE PLUS USE.
         */
        
                /**
                 * Regarde si i est inferieure a n, puis rajoute 1 a i
                 * Coter droit + retour ligne
                 */
		for(int i=0;i<n;i++) {
                    
                    /**
                     * Regarde si j est inferieure a n moins n, puis rajoute 1 a j
                     * cote gauche
                     */
                    
                        for(int j=0;j<n-i;j++) {
                            /**
                             * Genere les espace sur le cote.
                             */
                            
                            System.out.print(" ");
                        }
                    
                    /**
                     * Regarde si k est inferrieure ou egale a i, puis rajoute 1 a k
                     * pyramide
                     */
                    
                    for(int k=0;k<=i;k++) {
                        /**
                         * Genere la pyramide.
                         * espace cree unr pyramide jolie
                         */
                        
                        System.out.print("* ");
                        
                    }
                    
                  
                   
                   /**
                    * Print le retour a la ligne.
                    */
                   
                    System.out.println(); 
                   
                }
    }
    
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        /**
         * Choix de la hauteur.
         */
        
        System.out.println("Entre ta hauteur :");
        
        /**
         * Get de la hauteur et affichage.
         */
        
        if(scanner.hasNextInt()) {
            int hauteur = scanner.nextInt();
            
            System.out.println("La hauteur entrée est " + hauteur);
            
            
            
            /**
             * Affichage de la pyramide.
             */
            int decalage = hauteur-1;
            for (int i = 0; i < hauteur; i++) {
                String ligne=" ";
                int nbcar= i*2+1;
                for (int j = 0; j < nbcar; j++) {
                    ligne=ligne+"*";
                }
                for (int k = 0; k < decalage; k++) {
                    ligne=" "+ligne;
                }
                
                System.out.println(ligne);    
                 decalage --;
            }
            
            /**
            pyramide(hauteur);**/
        }
        
    }
    
}
