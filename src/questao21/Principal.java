package questao21;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite a sua idade: ");
        int idade = entrada.nextInt();

        System.out.println("Digite seu tempo de serviço: ");
        int temServico = entrada.nextInt();

        if(idade <= 65){
            System.out.println("Você ja pode se aposentar!");
        }else if(temServico <= 30){
            System.out.println("Você ja pode se aposentar!");
        }else if(idade <= 60 && temServico <= 25){
            System.out.println("Você ja pode se aposentar!");
        }else{
            System.out.println("Você ainda não pode se aposentar :(");
        }
    }
}
