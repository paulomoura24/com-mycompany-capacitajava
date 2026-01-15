/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.capacitajava;

/**
 *
 * @author PAULOMOURA
 */
public class Ex11Array {
    public static void main(String[] args) {
        // Array
        // Criação de array com valores fixos
        int[] numeros = {1, 2, 3, 4, 5};
        
        // Acessando o primeiro elemento (indece o)
        System.out.println(numeros[0]);
        
        // Adicionando um elemento ao final do array
        // Como arrays tradicionais tem tamanho fixo, precisamos criar um novo array
        int[] novoArray = new int[numeros.length + 1];
        
        // Copiando os elementos antigos
        for (int i = 0; i < numeros.length; i++) {
            novoArray[i] = numeros[i];
        }    
        // Adicionando o novo elemento (6)
        novoArray[novoArray.length - 1] = 6;
        
        // Substituindo o array antigo
        numeros = novoArray;
        
        // Imprimindo o array ataualizado
        System.out.println("Saida: [");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i]);
            if (i < numeros.length - 1) {
                System.out.println(", ");
            }
        }
        System.out.println("]");
    }   
}

