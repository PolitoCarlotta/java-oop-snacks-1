public class RegistroStudenti {

    private Studente[] studenti;

    private int contatore;

    public RegistroStudenti(){
        this.studenti = new Studente[5];
        this.contatore = 0;
    }

    public void aggiungiStudente(Studente studente){
        if(contatore >= studenti.length){
            System.out.println("Il registro ha raggiunto il limite massimo");
        } else{
            studenti[contatore] = studente;
            contatore ++;
        }
    }

    public void stampaRegistro (){
        for (int i = 0; i < contatore; i++) {
            System.out.println(studenti[i].studenteConcatenato());
        }
    }
}
