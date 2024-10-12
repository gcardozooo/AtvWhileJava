/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atvmedia.java;
import java.util.Scanner;

public class AtvMediaJava {

    public static void main(String[] args) {
           Scanner scanner = new Scanner(System.in);

      
        System.out.print("Quantos alunos tem na sala? ");
        int quantidadeAlunos = scanner.nextInt();

       
        double somaNotas = 0;
        int contador = 0;

        
        while (contador < quantidadeAlunos) {
            System.out.print("Digite a nota do aluno " + (contador + 1) + ": ");
            double nota = scanner.nextDouble();
            somaNotas += nota;
            contador++;
        }

       
        double media = somaNotas / quantidadeAlunos;
        System.out.printf("A média da turma é: %.2f\n", media);
    }
}
