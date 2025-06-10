// Figura 2.7 Adicao.java
// Programa de adição que insere dois números, então exibe a soma deles
package Day1;
import java.util.Scanner; // Nosso programa utiliza a classe Scanner

public class Adicao {
    public static void main(String[] args) {

        // Cria um Scanner para obter a entrada a partir do terminal
        Scanner entrada = new Scanner(System.in);

        int numero1; // primeiro número a somar
        int numero2; // segundo número a somar
        int soma; // resultado da soma dos dois números

        System.out.print("Digite o primeiro número inteiro: ");
        numero1 = entrada.nextInt(); // Lê o número fornecido pelo usuário

        System.out.print("Digite o segundo número inteiro: ");
        numero2 = entrada.nextInt(); // Lê o segundo número fornecido pelo usuário

        soma = numero1 + numero2;
        System.out.printf("Resultado: %d%n", soma); // Exibe o resultado
    }
}
