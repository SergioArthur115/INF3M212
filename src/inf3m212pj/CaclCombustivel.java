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
public class CaclCombustivel {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        float valor,rend,km,consumo,gasto;
        
        System.out.println("--Sistema de consumo de combustivel--");
        System.out.println("Informe o valor do litro: ");
        valor=ler.nextFloat();
        System.out.println("Informe o rendimento do seu veiculo: ");
        rend=ler.nextFloat();
        System.out.println("Informe a distancia percorrida: ");
        km=ler.nextFloat();
        
        consumo=km/rend;
        gasto=consumo*valor;
        
        System.out.printf("O consumo para esta viagem é %.2f litros",consumo);
        System.out.printf("\nO gasto para esta viagem é %.2f reais",gasto);
    }
    
}
