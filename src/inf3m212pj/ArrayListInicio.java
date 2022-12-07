/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inf3m212pj;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author 182120042
 */
public class ArrayListInicio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        ArrayList<String> nomes = new ArrayList<>();
        int op, ordem = 0;
        do {
            menu();
            op = ler.nextInt();
            if (op == 1) {
                System.out.println("Digite um nome: ");
                nomes.add(ler.next());
                if (nomes.size() > 1) {
                    Collections.sort(nomes);
                }
            } else if (op == 2) {
                if (nomes.isEmpty()) {
                    System.out.println("Está vazio");
                } else {
                    System.out.println("Digite o nome a ser removido");
                    nomes.remove(ler.next());
                }
            } else if (op == 3) {
                System.out.println("Tamanho do array: " + nomes.size());
            } else if (op == 4) {
                System.out.println("Digite 1 para mostrar na ordem horizontal e 2 para a vertical");
                ordem = ler.nextInt();
                for (String nome : nomes) {
                    if (ordem == 1) {
                        System.out.println(nomes.toString());
                    } else {
                        System.out.println("Nome: " + nome);
                    }
                }
            } else if (op == 0) {
                System.out.println("Aplicação encerrada pelo usuário!");
            } else {
                System.out.println("Opção inválida por favor tente novamente");
            }

        } while (op != 0);

    }

    public static void menu() {
        System.out.println("Digite 1 para inserir um nome");
        System.out.println("Digite 2 para remover um nome");
        System.out.println("Digite 3 para ver o tamanho da lista");
        System.out.println("Digite 4 para ver os nomes na lista");
        System.out.println("Digite 0 para sair");
        System.out.println("Digite aqui: ");

    }

}
