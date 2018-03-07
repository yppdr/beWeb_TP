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
public class Araignee extends Animal {
    
    public Araignee(){
        this.nbYeux = 188;
        this.nbPattes = 8;
    }
    
    @Override
    public void emettreSon() {
        System.out.println("Wesh alors ! ");
    }
    
}
