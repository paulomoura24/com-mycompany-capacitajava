/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.capacitajava;

import java.util.ArrayList;


public class Ex12ArrayList {
    public static void main(String[] args) {
        // Criação do ArrayList
        ArrayList<Integer> numeros = new ArrayList<>();
        
        // Adicionando elementos
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        
        // Acessando elementos
        System.out.println("Primeiro numero: " + numeros.get(0));
        
        // Modificando um elemento
        numeros.set(1, 5); // substitui o n° na posição 1 por 5
        
        // Removendo um elemento
        numeros.remove(0); 
        
        // Tamanmho do ArrayList
        System.out.println("Tamanho: " + numeros.size());
        
        // Exibindo todos os elementos
        System.out.println("Elementos:");
        for (int num : numeros) {
            System.out.println(num);
        }
    }
}
