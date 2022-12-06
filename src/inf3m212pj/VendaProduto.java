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
public class VendaProduto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner ler=new Scanner(System.in);
        float valorProduto,desconto=0,valorFinal;
        String tipoPag;
        
        System.out.println("--Sistema de venda de produtos");
        System.out.println("Informe o tipo de pagamento(A vista ou cartao): ");
        tipoPag=ler.next();
        System.out.println("Informe o valor do produto: ");
        valorProduto=ler.nextFloat();
        
        if(tipoPag.equals("vista")){desconto=valorProduto/10;}
        else if(tipoPag.equals("cartao")){desconto=0;}
        else{System.out.println("Tipo de pagamento não identificado!!!");}
        
        valorFinal=valorProduto-desconto;
        
        if(desconto!=0){
            System.out.printf("O desconto do produto foi de %.2f reais",desconto);
            System.out.printf("O valor final foi de %.2f reais",valorFinal);
        }
        else if(tipoPag.equals("cartao")){
            System.out.printf("O produto não está apto a desconto, valor final de %.2f reais",valorFinal);
        }
    }
    
}
