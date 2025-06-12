import java.util.Scanner;


public class Slide29 {
   public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);


       System.out.print("Horas: ");
       double horas = entrada.nextDouble();

       double minutos = horas*60;
       System.out.println("Minutos: " + minutos);
       entrada.close();
   }
}
