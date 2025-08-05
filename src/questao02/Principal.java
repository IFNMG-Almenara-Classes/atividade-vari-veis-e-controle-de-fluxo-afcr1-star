package questao02;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o seu peso: ");
        double peso = entrada.nextDouble();
        System.out.println("Digite sua altura: ");
        double altura = entrada.nextDouble();

        double imc = peso/(altura*altura);

        if(imc<18.5){
            System.out.printf("Seu imc é %.2f e você está com Magreza!", imc);
        }else if(imc>=18.5 && imc<25){
            System.out.printf("Seu imc é %.2f e você está Saudável!", imc);
        }else if(imc>=25 && imc<30){
            System.out.printf("Seu imc é %.2f e você está Sobrepeso!", imc);
        }else if(imc>=30 && imc<35){
            System.out.printf("Seu imc é %.2f e você está Obesidade Grau I!", imc);
        }else if(imc>=35 && imc<40){
            System.out.printf("Seu imc é %.2f e você está Obesidade Grau II (Severa)!", imc);
        }else if(imc>=40){
            System.out.printf("Seu imc é %.2f e você está Obesidade Grau III (Mórbida)!", imc);
        }
        entrada.close();
    }
}
