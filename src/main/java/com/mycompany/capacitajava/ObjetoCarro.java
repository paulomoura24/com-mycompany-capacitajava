/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.capacitajava;


public class ObjetoCarro {
    public static void main(String[] args) {
        Carro meuCarro = new Carro();
        meuCarro.cor = "Branco";
        meuCarro.modelo = "Fiat Mobi";
        meuCarro.ano = 2017;
        
        System.out.println("Meu carro é um " + meuCarro.modelo + " da cor " + meuCarro.cor + " e do ano " + meuCarro.ano);
        meuCarro.buzinar();
    }
}


