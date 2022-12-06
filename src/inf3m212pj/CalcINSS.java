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
public class CalcINSS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner ler= new Scanner(System.in);
        float salarioBruto,inss,salarioLiquido;
        
        System.out.println("--Sistema de calculo do INSS--");
        System.out.println("Informe seu salário bruto em reais: ");
        salarioBruto=ler.nextFloat();
        
        if(salarioBruto<=1212){inss=(float) (salarioBruto*7.5/100);}
        else if(salarioBruto<=2427.35){inss=(float)salarioBruto*9/100;}
        else if(salarioBruto<=3641.03){inss=(float)salarioBruto*12/100;}
        else if(salarioBruto<=7087.22){inss=(float)salarioBruto*14/100;}
        else{inss=(float)salarioBruto*14/100;}
        
        salarioLiquido=salarioBruto-inss;
        
        System.out.printf("O desconto do INSS foi de %.2f reais",inss);
        System.out.printf("\nO salário liquido foi de %.2f reais",salarioLiquido);
    }
    
}
