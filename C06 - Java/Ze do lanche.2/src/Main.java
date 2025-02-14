import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner entrada =  new Scanner(System.in);

        // Declarando variáveis
        System.out.println("Digite a quantidade de lanches consumidos na primeira hora: ");
        int hora1 = entrada.nextInt();
        System.out.println("Digite a quantidade de lanches consumidos na segunda hora: ");
        int hora2 = entrada.nextInt();
        System.out.println("Digite a quantidade de lanches consumidos na terceira hora: ");
        int hora3 = entrada.nextInt();


        int somalanches = hora1+hora2+hora3;
        int media = somalanches/3;

        System.out.println("Soma: " + somalanches);
        System.out.println("Media: " + media);
        entrada.close();
    }
}