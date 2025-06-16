/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.calculadorajava;

/**
 *
 * @author Matheus Brito Martins Moreira
 */
public class CalculadoraJava {

    public static void main(String[] args) {
        // Área do Quadrado (lado * lado)
        double ladoQuadrado = 5.5;
        double AreaQuadrado = ladoQuadrado * ladoQuadrado;
        System.out.println("Área do quadrado: " + AreaQuadrado);

        // Área do Retângulo (base * altura)
        double baseRetangulo = 10.0;
        double alturaRetangulo = 4.5;
        double AreaRetangulo = baseRetangulo * alturaRetangulo;
        System.out.println("Área do retângulo: " + AreaRetangulo);

        // Área do Losango ((diagonal maior * diagonal menor) / 2)
        double diagonalMaior = 8.0;
        double diagonalMenor = 6.0;
        double AreaLosango = (diagonalMaior * diagonalMenor) / 2;
        System.out.println("Área do losango: " + AreaLosango);

        // Área do Triângulo ((base * altura) / 2)
        double baseTriangulo = 7.0;
        double alturaTriangulo = 3.0;
        double AreaTriangulo = (baseTriangulo * alturaTriangulo) / 2;
        System.out.println("Área do triângulo: " + AreaTriangulo);

        // Área da Circunferência (π * raio²)
        double raio = 4.0;
        double AreaCircunferencia = Math.PI * raio * raio;
        System.out.println("Área da circunferência: " + AreaCircunferencia);

        // Soma
        double numero1 = 15.5;
        double numero2 = 4.5;
        double Soma = numero1 + numero2;
        System.out.println("Soma: " + Soma);

        // Subtração
        double Subtracao = numero1 - numero2;
        System.out.println("Subtração: " + Subtracao);

        // Multiplicação
        double Multiplicacao = numero1 * numero2;
        System.out.println("Multiplicação: " + Multiplicacao);

        // Divisão
        double Divisao = numero1 / numero2;
        System.out.println("Divisão: " + Divisao);

        // Média
        double numero3 = 20.0;
        double Media = (numero1 + numero2 + numero3) / 3;
        System.out.println("Média: " + Media);
    }
}