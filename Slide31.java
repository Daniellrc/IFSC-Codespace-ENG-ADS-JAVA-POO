import java.util.Scanner;

public class Slide31 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Primeira nota: ");
        double nota1 = entrada.nextDouble();
        
        System.out.print("Segunda nota: ");
        double nota2 = entrada.nextDouble();
        
        System.out.print("Terceira nota: ");
        double nota3 = entrada.nextDouble();
        
        System.out.print("Quarta nota: ");
        double nota4 = entrada.nextDouble();

        double media = ( nota1 + nota2 + nota3 + nota4 ) / 4;
        System.out.println("A média das notas é: " + media);
        entrada.close();
    }
}
