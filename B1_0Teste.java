import java.util.Scanner;

public class B1_0Teste {
    public static void main(String[] args) {
        Scanner linhadigitada = new Scanner(System.in); //Criação de um objeto scanner para ler dados de entrada do usuario

        System.out.print("Digite Algo:");
        String entrada = linhadigitada.nextLine(); //Lê toda a linha de texto, reconhecer metodo sempre está após o "."
        System.out.println("Você digitou: " + entrada); //Exibe o que foi escrito pelo usuario
        linhadigitada.close(); // Fecha o Scanner para liberar a saida
        }
}
