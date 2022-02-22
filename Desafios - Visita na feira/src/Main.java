import java.util.Scanner;   // Importando Scanner

public class Main {
    public static void main(String[] args){

        Scanner leitor = new Scanner(System.in);    // Scanner


        int a = leitor.nextInt();   // Declarando nome de variavel e que o valor dela é o proximo numero digitado
        int b = leitor.nextInt();   // Declarando nome de variavel e que o valor dela é o proximo numero digitado

        int resultado;              // Declando nome de variavel
        resultado = a + b;          // Calculo para definir valor de variavel

        System.out.println("X = "+ resultado);  // Printando o valor da variavel

    }
}
