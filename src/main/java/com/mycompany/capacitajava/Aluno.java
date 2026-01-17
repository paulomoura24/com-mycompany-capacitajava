/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.capacitajava;

/**
 *
 * @author PAULOMOURA
 */
public class Aluno extends Pessoa {
    int matricula;
    
    public Aluno(String nome, int idade, int matricula) {
        super(nome, idade); //Chama o construtor da classe mãe (Pessoa)
        this.matricula = matricula;
    }
    
    public void mostrarMatricula() {
        System.out.println("Minha matricula é: " + matricula);
    }
}
