import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Entrada de dados
        System.out.println("Digite a NPA: ");
        double npa = sc.nextDouble();

        // Análise da npa
        if (npa < 60) {
            System.out.println("O aluno ficou de NP3.");
            System.out.println("Nota NP3: ");
            double NP3 = sc.nextDouble();

            // Calculo da NFA
            double nfa = (NP3+npa)/2;
            if (nfa < 60) {
                System.out.println("Não passou!");
            }
            else {
                System.out.println("Passou!");
            }

        }
        else{
            System.out.println("O aluno passou.");
        }
    }
}