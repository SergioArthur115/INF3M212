/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inf3m212pj;

import static inf3m212pj.NotasEscolaresVetor.leiaFloat;
import static inf3m212pj.NotasEscolaresVetor.validaNota;
import java.util.Scanner;

/**
 *
 * @author 182120042
 */
public class NotasEscolaresMatriz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("--Sistema de notas escolares--");
        System.out.print("Informe o numero de alunos: ");
        int nAlunos = (int) leiaFloat();
        System.out.print("Informe o numero de notas: ");
        int nNotas = (int) leiaFloat();

        String alunos[] = new String[nAlunos];
        float notas[][] = new float[nAlunos][nNotas + 1];//nNotas + 1 para a média

        for (int i = 0; i < nAlunos; i++) {//percorre os alunos
            System.out.print("Informe o nome do aluno: ");
            alunos[i] = ler.next();
            for (int j = 0; j < nNotas; j++) {//percorre as notas
                do {
                    System.out.print("\tDigite a " + (j + 1) + "ª nota: ");
                    notas[i][j] = leiaFloat();
                    if (validaNota(notas[i][j])) {
                        System.out.println("Nota inválida, tente novamente!");
                    }

                } while (validaNota(notas[i][j]));
                notas[i][nNotas] += notas[i][j];//acumula as notas
            }//fim for notas
            notas[i][nNotas] = notas[i][nNotas] / nNotas;//calcula a media
        }//fim for alunos
        System.out.println("\n--Resultado--\n");
        for (int i = 0; i < nAlunos; i++) {
            System.out.printf(alunos[i] + " sua média foi de %.2f ", notas[i][nNotas]);
            if (notas[i][nNotas] >= 7) {
                System.out.println(" e você foi aprovado!");
            } else {
                System.out.println(" e você foi reprovado!");
            }
        }
    }

}
