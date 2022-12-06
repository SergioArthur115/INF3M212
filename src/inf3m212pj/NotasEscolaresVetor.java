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
public class NotasEscolaresVetor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("--Sistema de notas escolares--");
        System.out.print("Quant. notas a inserir?");
        int nNotas=(int)leiaFloat();
        
        float notas[] = new float[nNotas+1];

        for (int i = 0; i < nNotas; i++) {
            do {
                System.out.println("Informe a " + (i + 1) + "ª nota");
                notas[i]=leiaFloat();
                if (validaNota(notas[i])) {
                    System.out.println("Nota inválida, tente novamente!");
                }
            } while (validaNota(notas[i]));
            notas[nNotas] += notas[i];
        }
        notas[nNotas] = notas[nNotas] / nNotas;

        System.out.printf("A média foi aluno foi %.2f " , notas[nNotas]);

        if (notas[nNotas] >= 7) {
            System.out.println("Voce está aprovado!!");
        } else {
            System.out.println("Voce está reprovado!!!");
        }
    }
    public static boolean validaNota(float nota){
        return nota < 0 || nota > 10;
    }
    public static float leiaFloat(){
        Scanner ler = new Scanner(System.in);
        try{
            return ler.nextFloat();
        }catch(Exception e){
            System.out.print("Valor não é núm., tente novamente: ");
            return leiaFloat();
        }
    }

}
