import java.util.Scanner;

public class Slide33 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Quantidade de anos: ");
        double anos = entrada.nextDouble();
        double dias = anos*365;
        System.out.println(anos + " anos em dias será: " + dias);
        entrada.close();
    }
}
