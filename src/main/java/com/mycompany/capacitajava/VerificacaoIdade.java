/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.capacitajava;

/**
 Escreva um programa Java que leia a idade de uma pessoa(valor fixo) e verifique
 se ela é maior de idade. Exiba "Maior de idade" ou "Menor de idade"
 */
public class VerificacaoIdade {
    public static void main(String[] args) {
        int idade = 20;
        
        if (idade >= 18) {
            System.out.println("Maior de idade");
        } else {
            System.out.println("Menor de idade");
        }
    }
}
