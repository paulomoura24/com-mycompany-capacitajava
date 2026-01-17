/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.capacitajava;

/**
 *
 * @author PAULOMOURA
 */
public class Ex19Heranca {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("Carlos", 20, 12345);
        Professor professor1 = new Professor("Ana", 40, 5000);
        
        //Métodos herdados da classe Pessoa
        aluno1.apresentar();
        professor1.apresentar();
        
        //Métodos especificados de cada subclasse
        aluno1.mostrarMatricula();
        professor1.mostrarSalario();
    }
}
