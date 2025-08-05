package questao22;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        int opcao;

        System.out.println("Digite o número do mês (entre 1 e 12: ");
        opcao = entrada.nextInt();

        switch(opcao){
            case 1:
                System.out.println("1 - Janeiro");
                break;
            case 2:
                System.out.println("2 - Fevereiro");
                break;
            case 3:
                System.out.println("3 - Março");
                break;
            case 4:
                System.out.println("4 - Abril");
                break;
            case 5:
                System.out.println("5 - Maio");
                break;
            case 6:
                System.out.println("6 - Junho");
                break;
            case 7:
                System.out.println("7 - Julho");
                break;
            case 8:
                System.out.println("8 - Agosto");
                break;
            case 9:
                System.out.println("9 - Setembro");
                break;
            case 10:
                System.out.println("10 - Outubro");
                break;
            case 11:
                System.out.println("11 - Novembro");
                break;
            case 12:
                System.out.println("12 - Dezembro");
                break;
            default:
                System.out.println("Número invalido! Digite de 1 a 12");
        }
    }
}
