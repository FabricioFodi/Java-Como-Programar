package Day1;

public class Aula {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        System.out.println("Aula 1 - Variáveis");
        System.out.println("A soma de 'a' + 'b' é: " + (a + b));
        System.out.println("A subtração de 'a' - 'b' é: " + (a - b));
        System.out.println("A multiplicação de 'a' * 'b' é: " + (a * b));
        System.out.println("A divisão de 'a' / 'b' é: " + (a / b));
        System.out.println("O resto da divisão de 'a' % 'b' é: " + (a % b));
        System.out.println("A raiz quadrada de 'a' é: " + Math.sqrt(a)); // Math é uma classe da bilbioteca Java para operações matemáticas
        System.out.println("A raiz quadrada de 'b' é: " + Math.sqrt(b)); // sqrt() é um método da class Math que calcula a raiz quadrada. sqrt() significa Square Root (raiz quadrada)
    }
}