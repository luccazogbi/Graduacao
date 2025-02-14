import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Indique a quantidade de alunos matriculados: ");
        int alunos = teclado.nextInt();

        switch (alunos){
            case 10:
            case 20:
                System.out.println("Sala I-16");
                break;
            case 30:
                System.out.println("Sala I-22");
                break;
            default:
                System.out.println("Não sabemos onde será a aula.");
                break;
        }
    }
}