/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.capacitajava;

/**
 *
 * @author PAULOMOURA
 */
public class Ex20Poliformismo {
    public static void main(String[] args) {
        Animal a1 = new Cachorro();
        Animal a2 = new Gato();
        
        a1.fazerSom();
        a2.fazerSom();
    }
}
