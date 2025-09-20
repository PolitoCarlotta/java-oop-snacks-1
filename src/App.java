public class App {
    public static void main(String[] args) throws Exception {

        Studente s1 = new Studente("Carlotta", "Polito", 35);

        System.out.println(s1.studenteConcatenato());
        System.out.println("");

        ContoBancario c1 = new ContoBancario("0025689");
        c1.deposita(200);
        System.out.println(c1.getSaldoCorrente());
        c1.preleva(100);
        System.out.println(c1.getSaldoCorrente());
    }
}
