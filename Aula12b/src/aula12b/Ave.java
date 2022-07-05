/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula12b;

/**
 *
 * @author User
 */
public class Ave extends Animal {
    private String corPena;
    
    @Override
    public void locomover() {
        System.out.println("VOANDO");
    }
    
    @Override
    public void alimentar() {
        System.out.println("COMENDO INSETOS");
    }
    
    @Override
    public void emitirSom() {
        System.out.println("PI");
    }
    
    public void fazerNinho() {
        System.out.println("NINHO FEITO.");
    }
}
