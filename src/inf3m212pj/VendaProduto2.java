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
public class VendaProduto2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int op;
        float valor, total;
        String nome;

        System.out.println("--Sistema de Compra--");
        System.out.println("1 - Venda a Vista");
        System.out.println("2 - Venda a prazo 30 dias");
        System.out.println("3 - Venda a prazo 60 dias");
        System.out.println("4 - Venda a prazo 90 dias");
        System.out.println("5 - Venda com Cartão de Débito");
        System.out.println("6 Venda com Cartão de Crédito");
        System.out.println("Digite a opção: ");
        op = ler.nextInt();

        System.out.println("Digite o Nome do Produto: ");
        nome = ler.next();
        System.out.println("Digite o Valor do Produto: ");
        valor = ler.nextFloat();

        if (op == 1) {
            total = (float) (valor * 0.9);
        } else if (op == 2) {
            total = (float) (valor * 0.95);
        } else if (op == 3) {
            total = valor;
        } else if (op == 4) {
            total = (float) (valor * 1.05);
        } else if (op == 5) {
            total = (float) (valor * 0.92);
        } else if (op == 6) {
            total = (float) (valor * 0.93);
        } else {
            total = 0;
            System.out.println("Opção inválida!!!");
        }
        if(op>=1 && op <=6){System.out.printf("O produto "+nome+" teve um custo total de %.2f reais",total);}
    }

}
