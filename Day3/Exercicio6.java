//Escreva instruções para realizar cada uma das tarefas a seguir:
//f) Se a variável number não for igual a 7, exiba “The variable number is not equal to 7".

package Day3;

import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int valor;

        System.out.print("Informe um número inteiro: ");
        valor = scan.nextInt();

        scan.close();
        if (valor != 7) {
            System.out.print("A variável valor não é igual a 7");
            return;
        }
        System.out.print("A variável valor é igual a 7");
    }
}
