package Day2;

import java.util.Scanner;

// Figura 2.15: Comparacao.java
// Compara inteiros utilizando instruções if, operadores relacionais
// e operadores de igualdade.
public class Comparacao {

    // método main inicia a execução do aplicativo Java
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int numero1;
        int numero2;

        System.out.print("Digite o primeiro número: ");
        numero1 = entrada.nextInt();

        System.out.print("Digite o segundo número: ");
        numero2 = entrada.nextInt();

        if (numero1 == numero2)
            System.out.printf("%d == %d%n", numero1, numero2);

        if (numero1 != numero2)
            System.out.printf("%d != %d%n", numero1, numero2);

        if (numero1 < numero2)
            System.out.printf("%d < %d%n", numero1, numero2);

        if (numero1 > numero2)
            System.out.printf("%d > %d%n", numero1, numero2);

        if (numero1 >= numero2)
            System.out.printf("%d >= %d%n", numero1, numero2);

        if (numero1 <= numero2)
            System.out.printf("%d <= %d%n", numero1, numero2);
    }
}
