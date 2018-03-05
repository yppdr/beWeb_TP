/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algo_tp_resto;

import java.util.Scanner;

/**
 *
 * @author yannis Piot Pilot
 */
public class Algo_tp_resto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.println("Entre ta hauteur :");
        
        if(scanner.hasNextInt()) {
            int hauteur = scanner.nextInt();
            System.out.println(hauteur);
        }
        
        
    }
    
}
