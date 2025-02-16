import java.util.Random;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); // Declara o meu teclado para ler a entrada do usuário
        Random rand = new Random();

        int x = rand.nextInt(10) + 1; // A função "rand" gera um número de 0 a 9, portanto, somamos 1 para ir de 1 a 10.

        while(true) {

            System.out.println("Qual número foi gerado: ");
            int y = sc.nextInt();

            if (y == x) {
                System.out.println("Você acertou o número gerado!");
                break;
            }
            else if(y > x){
                System.out.println("O número que você digitou é maior que o gerado.");
            }
            else {
                System.out.println("O número que você digitou é menor que o gerado. ");
            }
        }
    }
}