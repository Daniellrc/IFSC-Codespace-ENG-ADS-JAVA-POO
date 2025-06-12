import java.util.Scanner;


public class Slide30{
   public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);


       System.out.print("Minutos: ");
       double minutos = entrada.nextDouble();

       double horas = minutos/60;
       System.out.println("Horas: " + horas);
       entrada.close();
   }
}
