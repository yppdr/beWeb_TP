/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.beweb.lunel.algo.poo.heritage;

/**
 *
 * @author yannis
 */
public class Animal{
    protected int nbYeux;
    protected int nbPattes;
    protected String couleur;
    
    
    public void emettreSon(){
        
    }
    
    /** Paf la voiture :( ( modifi l'etat de l'animal // Modifi les uex et les pattes ) **/
    public void accident(){
        this.nbYeux --;
    }
}