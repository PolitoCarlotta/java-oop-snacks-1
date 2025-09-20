public class App {
    public static void main(String[] args) throws Exception {

        Studente s1 = new Studente("Carlotta", "Polito", 35);
        Studente s2 = new Studente("Marco", "Rossi", 22);
        Studente s3 = new Studente("Giulia", "Bianchi", 40);
        Studente s4 = new Studente("Eric", "Verdi", 30);
        Studente s5 = new Studente("Stefania", "Neri", 20);
        Studente s6 = new Studente("Marta", "Azzurro", 18);

        System.out.println(s1.studenteConcatenato());
        System.out.println("");

        ContoBancario c1 = new ContoBancario("0025689");
        c1.deposita(200);
        System.out.println(c1.getSaldoCorrente());
        c1.preleva(100);
        System.out.println(c1.getSaldoCorrente());

        System.out.println("");
        RegistroStudenti r1 = new RegistroStudenti();
        r1.aggiungiStudente(s1);
        r1.aggiungiStudente(s2);
        r1.aggiungiStudente(s3);
        r1.aggiungiStudente(s4);
        r1.aggiungiStudente(s5);

        r1.stampaRegistro();
    }
}
