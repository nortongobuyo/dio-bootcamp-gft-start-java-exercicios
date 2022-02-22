import java.util.Scanner; // Importando Scanner

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  // Scanner

        double A, B, media; //  Declarando variaveis e nomes.

        A = sc.nextDouble();    // Variavel A = Proxima double que for digitada
        B = sc.nextDouble();    // Variavel B = Proxima double que for digitada

        //TODO: Complete os espaços em branco com as respectivas variáveis para o cálculo da média.
        media = (  A   * 3.5 +  B  * 7.5)/11; // Calculo para descobrir a média

        //TODO: Complete com a variável que representa o resultado da média.
        System.out.printf(" MEDIA = %.5f", media); // Printando o resultado do calculo, %.5f usado para especificar que é um numero float/double e que só quero 5 digitos apos o ponto/virgula.
        System.out.println(); // Fim de linha
    }
}