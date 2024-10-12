/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atvnumerosmaiores;
import java.util.Scanner;
public class AtvNumerosMaiores {

    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);


        int maior = Integer.MIN_VALUE;
        int segundoMaior = Integer.MIN_VALUE;

        int contador = 0;

        while (contador < 10) {
            System.out.print("Digite o número " + (contador + 1) + ": ");
            int numero = scanner.nextInt();

            if (numero > maior) {
                segundoMaior = maior;
                maior = numero;
            } else if (numero > segundoMaior) {
                segundoMaior = numero;
            }

            contador++;
        }

        System.out.println("O maior número é: " + maior);
        System.out.println("O segundo maior número é: " + segundoMaior);
    }
}
