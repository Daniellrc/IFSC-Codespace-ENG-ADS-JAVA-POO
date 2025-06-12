import java.util.Scanner;

public class Slide32 {
    public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);

        System.out.print("Valor total: ");
        double total = entrada.nextDouble();

        System.out.print("Valor do desconto: ");
        double desconto = entrada.nextDouble();

        double valordesc = total - desconto;
        System.out.println("O valor com desconto será: " + valordesc);
        entrada.close();
    }
}
