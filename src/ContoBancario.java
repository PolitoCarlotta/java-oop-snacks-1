public class ContoBancario {

    private double saldo;

    private String numeroConto;

    public ContoBancario(String numeroConto){
        this.numeroConto = numeroConto;
        this.saldo = 0;
    }

    public void deposita(double deposito){
        if(deposito <=0){
            System.out.println("il deposito non è valido");
        } else {
            this.saldo +=deposito;
        }
    }

    public void preleva(double prelievo){
        if(prelievo > saldo){
            System.out.println("Non puoi prelevare più di quanto hai sul conto");
        }else {
            this.saldo -= prelievo;
        }
    }

    public String getSaldoCorrente(){
        return "Il saldo è: " + this.saldo;
    }

}
