/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.capacitajava;

/**
 *
 * @author PAULOMOURA
 */
public class Professor extends Pessoa {
    // A classe Professor herda de pessoa
    double salario;
    
    public Professor(String nome, int idade, double salario) {
        super(nome, idade); // Chama o construtor da classe mãe (Pessoa)
        this.salario = salario;
    }
    
    public void mostrarSalario() {
        System.out.println("Meu salário é: R$ " + salario);
    }
    
}
