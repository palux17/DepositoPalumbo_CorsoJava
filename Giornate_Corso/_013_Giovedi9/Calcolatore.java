public class Calcolatore {

    //Interfaccia come attributo
    private Operazione operazione;

    //setter per cambiare strategia a runtime
    public void setOperazione(Operazione operazione) {
        this.operazione = operazione;
    }
    
    public int calcola(int a, int b) {
        if (operazione == null) {
            throw new RuntimeException("Operazione non impostata!");
        }
        return operazione.esegui(a, b);
    }
}