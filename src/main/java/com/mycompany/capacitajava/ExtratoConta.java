/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.capacitajava;

/**
 *
 * @author PAULOMOURA
 */
public class ExtratoConta {
    public static void main(String[] args) {
        // Criamos um objeto da classe conta
        Conta minhaConta = new Conta();
        
        // Definindo um saldo inicial usando setSaldo()
        minhaConta.setSaldo(1000);
        System.out.println("Saldo inical: R$ " + minhaConta.getSaldo());
        
        // Realizando um depósito
        minhaConta.depositar(500);
        System.out.println("Saldo após depósito: R$ " + minhaConta.getSaldo());
        
        // Realizando um saque
        minhaConta.sacar(200);
        System.out.println("Saldo após saque: R$ " + minhaConta.getSaldo());    
    }
}
