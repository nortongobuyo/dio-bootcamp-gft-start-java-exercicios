import java.util.Scanner; // Importando scanner

public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in); // Scanner

        double raio = scan.nextDouble(); // Definindo nome de variavel e que ela é o proximo numero digitado
        double n = 3.14159;             // Definindo nome de variavel e valor dela
        double area;                    // Definindo nome de variavel

        area = 3.14159 * (Math.pow( raio   ,2)); // Calculo para definir o valor da variavel area

        System.out.printf("A=%.4f", area);  // Printando resultado da variavel area, usado %.4f para especificar que é uma float/double e que também eu quero apenas 4 digitos após a virgula.
    }
}