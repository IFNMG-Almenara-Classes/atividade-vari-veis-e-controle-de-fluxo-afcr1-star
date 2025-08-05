package questao18;
import java.util.Scanner;

public class Principal {
        public static void main(String[] args) {
            Scanner entrada = new Scanner(System.in);

            System.out.print("Digite o primeiro número: ");
            int inicio = entrada.nextInt();
            System.out.print("Digite o segundo número: ");
            int fim = entrada.nextInt();

            int primos = 0;

            for (int i = inicio; i <= fim; i++) {
                if(ehPrimo(i)) {
                    primos++;
                }
            }

            System.out.println("Quantidade de números primos entre " + inicio + " e " + fim + ": " + primos);

        }

        public static boolean ehPrimo(int n) {
            if (n <= 1) return false;
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) return false;
            }
            return true;
        }
    }