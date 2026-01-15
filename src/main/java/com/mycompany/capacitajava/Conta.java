/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.capacitajava;

/**
 *
 * @author PAULOMOURA
 */
public class Conta {
    private double saldo; //Atributo encapsulado
    
    // Getter - Retorna o saldo atual
    public double getSaldo() {
        return saldo;
    }
    
    // Setter - Permite modificar o saldo de forma controlada(apenas positivo)
    public void setSaldo(double saldo) {
        if (saldo >= 0) {   // Garante que o saldo não seja negativo
            this.saldo = saldo;
        } else {
            System.out.println("Erro: o saldo não pode ser negativo");
        }
    }
    
    // Método para realizar um depósito via setSaldo()
    public void depositar(double valor){
        if (valor > 0) {
            setSaldo(this.saldo + valor); // Chamada setSaldo() internamente
            System.out.println("Depósito realizado: R$ " + valor);
        } else {
            System.out.println("Valor inválido para depósito");
        }      
    }
    
    // Método para realizar um saque via setSaldo()
    public void sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            setSaldo (this.saldo - valor);
            System.out.println("Saque realizado: R$ " + valor);
        } else {
            System.out.println("Saldo insuficiente ou valor inválido");
        }
    }
    
}
