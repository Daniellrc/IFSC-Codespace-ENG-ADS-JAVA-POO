import java.util.Scanner;

public class Slide35 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Entre com a: ");
        double numeroa = entrada.nextDouble();
        System.out.print("Entre com b: ");
        double numerob = entrada.nextDouble();
        System.out.print("Entre com c: ");
        double numeroc = entrada.nextDouble();
        double deltaneg = (-numerob - Math.sqrt((numerob*numerob) -4*numeroa*numeroc) ) / 2*numeroa ;
        double deltapos = (-numerob + Math.sqrt((numerob*numerob) -4*numeroa*numeroc) ) / 2*numeroa ;
        System.out.println("A bhaskara é: " + deltaneg + " e " + deltapos);
        entrada.close();
    }
}