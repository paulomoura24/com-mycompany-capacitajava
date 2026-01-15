/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.capacitajava;


public class Ex14Strings {
    public static void main(String[] args) {
        // Declaração:
        String nome = "Maria";
        String sobreNome = " Silva ";
        
        // Concatenar Strings (length())
        String nomeCompleto = nome + sobreNome;
        System.out.println(nomeCompleto);
        
        // Tamanho da String
        System.out.println(nomeCompleto.length());
        
        // Acessar caracteres(charAt())
        System.out.println(nomeCompleto.charAt(4));
        
        // Transformar maiúsculas/minúsculas:
        System.out.println(nomeCompleto.toUpperCase());
        System.out.println(nomeCompleto.toLowerCase());
        
        // Buscar conteúdo (contains(), startsWith(), endsWith())
        System.out.println(nome.contains("ria"));
        System.out.println(nome.startsWith("Mar"));
        System.out.println(nome.endsWith("oi"));
        
        // Extrair partes da String (substring())
        System.out.println(nomeCompleto.substring(7));
        System.out.println(nomeCompleto.subSequence(0, 5));
        
        String semEspacos = sobreNome.trim();
        System.out.println(semEspacos);
        
        // Dividir String em partes(split())
        String data = "2026-01-13";
        String[] partes = data.split("-");
        System.out.println(partes[0]);
        System.out.println(partes[1]);
        System.out.println(partes[2]);
        
        // Comparar Strings (equals(), equalsignore())
        String a = "Java";
        String b = "java";
        
        System.out.println(a.equals(b));
        System.out.println(a.equalsIgnoreCase(b));
        
        
    }
}
