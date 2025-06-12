import java.util.Scanner;

public class Slide28 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite a base do triângulo: ");
        Double base = entrada.nextDouble();

        System.out.print("Digite a altura do triângulo: ");
        Double altura = entrada.nextDouble();
        
        double área = (base*altura) / 2;
        System.out.println(área);
        entrada.close();
    }
    
}
