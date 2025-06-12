import java.util.Scanner;

public class Slide34 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Valor em dolares: ");
        double dolares =  entrada.nextDouble();
        double reais = dolares*5.64;
        System.out.println("O valor de " + dolares + " dolares em reais é: " + reais);
        entrada.close();
    }
}
