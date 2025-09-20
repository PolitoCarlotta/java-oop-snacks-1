import java.util.Scanner;

public class UsaQuiz {

    public static void main(String[] args) {
        Quiz quiz1 = new Quiz("Di che colore è il cielo?", "Verde acqua");

        Scanner input = new Scanner(System.in);

        System.out.println("La domanda é: " + quiz1.getDomanda());
        System.out.print("Inserisci la risposta: ");
        String rispostaUtente = input.nextLine();

        System.out.println(quiz1.verificaRisposta(rispostaUtente));
        System.out.println(quiz1.stampaQuiz());
    }
}
