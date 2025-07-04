// Escreva instruções Java que realizem cada uma das seguintes tarefas:
// a) Exibir a mensagem “Enter an integer: “, deixando o cursor na mesma linha.
// b) Atribuir o produto de variáveis b e c para a variável a.
// c) Utilizar um comentário para afirmar que um programa executa um cálculo de exemplo de folha de pagamento

package DayFive;

public class DoisPontoOito {

    public static void main(String[] args) {
        System.out.print("Enter an integer: "); //Exercício A

        int a;
        int b = 6;
        int c = 5;
        a = b + c; //Exercicio B
    
        int horasTrabalhadas = 220, diasNaSemana = 5;
        double resultado;
        resultado = horasTrabalhadas * diasNaSemana; //essa linha executa um cálculo de salário bruto - Exercicio C
    }
}
