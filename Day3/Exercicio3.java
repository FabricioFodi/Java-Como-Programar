//Escreva instruções para realizar cada uma das tarefas a seguir:
//c) Insira um inteiro e atribua o resultado à variável int value. 
//Suponha que a variável Scanner input possa ser utilizada para ler um valor digitado pelo usuário.

package Day3;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int value;

        System.out.print("Insira um valor inteiro: ");
        value = scan.nextInt();
        System.out.printf("Resultado: %d", value);
        scan.close();
    }
}
