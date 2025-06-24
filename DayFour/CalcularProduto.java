// Usando as instruções que você escreveu no Exercício 2.5
// elabore um programa completo que calcule e imprima o produto de três inteiros.
package DayFour;

import java.util.Scanner;

public class CalcularProduto {
    public static void main(String[] args) {

        int numeroUm;
        int numeroDois;
        int numeroTres;
        int resultado;

        Scanner scan = new Scanner(System.in);

        System.out.print("Insira o 1° número inteiro positivo: ");
        numeroUm = scan.nextInt();

        System.out.print("Insira o 1° número inteiro positivo: ");
        numeroDois = scan.nextInt();

        System.out.print("Insira o 1° número inteiro positivo: ");
        numeroTres = scan.nextInt();
    
        resultado = numeroUm * numeroDois * numeroTres;
        System.out.printf("O produto de três número inteiros positivos é: %s", resultado); 
    }    
}
