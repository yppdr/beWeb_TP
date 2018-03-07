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
public class Chat extends Animal{

    public Chat() {
        this.nbPattes = 4;
        this.nbYeux = 9;
    }
    
    @Override
    public void emettreSon() {
        System.out.println("Miaow");
    }
    
    public void grimpArbre(){
        System.out.println("Oupp c'toi l'chat !");
    }
    
}
