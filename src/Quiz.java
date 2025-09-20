public class Quiz {

    private String domanda;

    private String risposta;

    public Quiz (String domanda, String risposta){
        if(domanda == null || domanda.isBlank()){
            System.out.println("La domanda inserita non è valida");
        } else {
            this.domanda = domanda;
        }

        if(risposta == null || risposta.isBlank()){
            System.out.println("La risposta inserita non è valida");
        } else {
            this.risposta = risposta;
        }
       
    }

    public String getDomanda(){
        return this.domanda;
    }

    public String verificaRisposta(String rispostaUtente){
        if(rispostaUtente.toLowerCase().trim().equals(this.risposta.toLowerCase().trim())){
            return "La risposta inserita è corretta";
        } else {
            return "La risposta inserita è sbagliata";
        }
    }

    public String stampaQuiz(){
        return this.domanda + "\n" + this.risposta;
    }

}
