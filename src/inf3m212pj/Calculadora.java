/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inf3m212pj;

import java.util.Scanner;

/**
 *
 * @author 182120042
 */
public class Calculadora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        float n1, n2, resultado = 0;
        char op;
        String nome = "";

        System.out.println("--Calculadora--");
        System.out.println("Escreva + para Adição");
        System.out.println("Escreva - para Subtração");
        System.out.println("Escreva * para Multiplicação");
        System.out.println("Escreva / para Divisão");
        System.out.println("Digite a opção: ");
        op = ler.nextLine().charAt(0);
        System.out.println("Digite o primeiro numero: ");
        n1 = ler.nextFloat();
        System.out.println("Digite o segundo numero: ");
        n2 = ler.nextFloat();

        if (op == '+') {
            resultado = n1 + n2;
            nome = "adição";
        } else if (op == '-') {
            resultado = n1 - n2;
        } else if (op == '*') {
            resultado = n1 * n2;
        } else if (op == '/') {
            resultado = n1 / n2;
        } else {
            System.out.println("ERROR 404");
        }
        if (op == '+' || op == '-' || op == '*' || op == '/') {
            System.out.printf("Para a operação de " + nome + " o resultado foi de %.2f", resultado);
        }
    }

}
