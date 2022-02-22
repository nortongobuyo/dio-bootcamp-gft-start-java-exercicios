import java.io.IOException;
import java.util.Scanner; // Importando Scanner

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);    // Scanner
        double A = leitor.nextDouble();             // Definindo nome de variavel e que o valor é o proximo numero digitado
        double B = leitor.nextDouble();             // Definindo nome de variavel e que o valor é o proximo numero digitado

        double resultado;                           // Definindo nome de variavel
        float C = 100;                              // Definindo nome de variavel e valor

        if( A <= B){                                // Condição de loop
            resultado = ((B - A)/ A)* C ;           // Calculo para identificar valor da variavel

            System.out.printf("%.2f", resultado);   // Printando o valor da variavel e usando %.2f para especificar que é um valor float/double e que quero apenas dois digitos depois da virgula
            System.out.printf("%%");                // Printando o simbolo de porcentagem após o resultado
        }
        else{                                       // Caso não bata a condição, faça isso
            resultado = ((A - B)/ A)* C ;           // Calculo para identificar valor da variavel

            System.out.printf("%.2f", resultado);   // Printando o valor da variavel e usando %.2f para especificar que é um valor float/double e que quero apenas dois digitos depois da virgula
            System.out.printf("%%");                // Printando o simbolo de porcentagem após o resultado
        }

    }

}