import java.io.IOException;
import java.util.Scanner; // Importando scanner
public class Main {
    public static void main(String[] args) throws IOException {
        Scanner s = new Scanner(System.in); //Scanner
        int x = s.nextInt(); // Declarando variavel e que ela é o proximo numero digitado
        for (int i = 2 ; i <= x ; i+=2) { System.out.println(i); } // Loop
    }
}