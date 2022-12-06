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
public class DiasVida {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int diasVida,idade;
        
        System.out.println("--Calculadora de dias de vida aproximado");
        System.out.println("Informe sua idade: ");
        idade=ler.nextInt();
        diasVida= idade*365;
        
        System.out.println("Voce ja viveu "+diasVida+" dias de vida");
    }
    
}
