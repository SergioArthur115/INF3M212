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
public class CalcIMC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float peso,altura,imc;
        String nome;
         Scanner leia = new Scanner(System.in);
         
         System.out.println("Calculadora de IMC");
         System.out.println("Informe seu nome: ");
         nome = leia.next();
         System.out.print("Informe sua altura: ");
         altura = leia.nextFloat();
         System.out.print("Informe seu peso: ");
         peso = leia.nextFloat();
         imc=peso/(altura*altura);
         
         System.out.printf(nome+" O imc foi de: %.2f", imc);
    }
    
}
