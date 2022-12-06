/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inf3m212pj;

import static inf3m212pj.NotasEscolaresVetor.leiaFloat;
import static inf3m212pj.NotasEscolaresVetor.validaNota;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author 182120042
 */
public class NotasEscolaresArrayListMenu {
    
    static ArrayList<String> alunoA = new ArrayList<>();
    static String alunos[];
    static float notas[][];
    static int nAlunos, contAlunos, nNotas;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int op;
        System.out.println("--Sistema de notas escolares--");
        //System.out.print("Informe o numero de alunos: ");
        //nAlunos = (int) leiaFloat();
        System.out.print("Informe o numero de notas: ");
        nNotas = (int) leiaFloat();

        alunos = new String[nAlunos];
        notas = new float[nAlunos][nNotas + 1];//nNotas + 1 para a média

        do {
            menu();
            op = (int) leiaFloat();
            if(op==1){inserirAlunoNotas();}
            else if(op==2){imprimirAlunosNotas();}
            else if(op==0){System.out.println("Aplicação encerrada pelo usuário!");}
            else{System.out.println("Opção inválida por favor tente novamente");}
            
        } while (op != 0);
    }

    public static void menu() {
        System.out.println("Digite 1 para inserir notas do Aluno");
        System.out.println("Digite 2 para imprimir notas");
        System.out.println("Digite 0 para sair");
        System.out.println("Digite aqui: ");

    }

    public static void inserirAlunoNotas() {
        Scanner ler = new Scanner(System.in);
        if (contAlunos < nAlunos) {
            System.out.print("Informe o nome do aluno: ");
            alunos[contAlunos] = ler.next();
            for (int j = 0; j < nNotas; j++) {//percorre as notas
                do {
                    System.out.print("\tDigite a " + (j + 1) + "ª nota: ");
                    notas[contAlunos][j] = leiaFloat();
                    if (validaNota(notas[contAlunos][j])) {
                        System.out.println("Nota inválida, tente novamente!");
                    }

                } while (validaNota(notas[contAlunos][j]));
                notas[contAlunos][nNotas] += notas[contAlunos][j];//acumula as notas
            }//fim for notas
            notas[contAlunos][nNotas] = notas[contAlunos][nNotas] / nNotas;//calcula a media
            contAlunos++;
        } else {
            System.out.println("Não é possível lançar notas." + "\nTodas posições ocupadas.");
        }
    }

    public static void imprimirAlunosNotas() {
        System.out.println("\n--Resultado--\n");
        for (int i = 0; i <= contAlunos; i++) {
            System.out.printf(alunos[i] + " sua média foi de %.2f ", notas[i][nNotas]);
            if (notas[i][nNotas] >= 7) {
                System.out.println(" e você foi aprovado!");
            } else {
                System.out.println(" e você foi reprovado!");
            }
        }
    }

}
