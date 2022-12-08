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
public class Triangulo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int op;
        do {
            menu();
            op = ler.nextInt();
            if (op == 1) {
                verificaTriangulo();
            }
        } while (op != 0);
    }

    public static void menu() {
        System.out.println("Digite 1 para verificar triangulo");
        System.out.println("Digite 0 para sair");
        System.out.println("Digite aqui: ");

    }

    public static void verificaTriangulo() {
        Scanner ler = new Scanner(System.in);
        int l1, l2, l3;
        System.out.println("Digite o primeiro lado");
        l1 = ler.nextInt();
        System.out.println("Digite o segundo lado");
        l2 = ler.nextInt();
        System.out.println("Digite o terceiro lado");
        l3 = ler.nextInt();
        if ((l2 - l3) < l1 && l1 < l2 + l3) {
            System.out.println("É triangulo");
            if (l1 == l2 && l2 == l3) {
                System.out.println("É equilatero");
            } else if ((l1 == l2 && l2 != l3 && l1 != l3)||l2==l3&&l1!=l2&&l1!=l3) {
                System.out.println("É isósceles");
            } else if (l1 != l2 && l2 != l3) {
                System.out.println("É escaleno");
            }
        } else {
            System.out.println("Não é triangulo");
        }
    }
}
