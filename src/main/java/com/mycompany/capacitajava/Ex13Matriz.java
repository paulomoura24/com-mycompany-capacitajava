/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.capacitajava;

/**
 *
 * @author PAULOMOURA
 */
public class Ex13Matriz {
    public static void main(String[] args) {
      // Arrays Multidimensionais (Matriz)
      
      // Declaração de uma matriz (Array 2D)
      int[][] matriz = new int[2][3];
      
      // Inicialização
      int [][] matrizl = {
          {1, 2, 3},
          {4, 5, 6}
      };
      // Acesso
        System.out.println(matrizl[1][2]);
        
      // Percorrendo uma matriz
      for (int i = 0; i < matrizl.length; i++) {
          for (int j = 0; j < matrizl[i].length; j++) {
            System.out.println(matrizl[i][j] + " ") ;
          }
          System.out.println();
      }
    }
}

