public class Ordine {

    //Attributi + Costruttori + Getter e Setter
    private int id;
    private String nomeCliente;
    private String prodotto;
    private int quantita;
    private String stato;
    public Ordine(int id, String nomeCliente, String prodotto, int quantita, String stato) {
        this.id = id;
        this.nomeCliente = nomeCliente;
        this.prodotto = prodotto;
        this.quantita = quantita;
        this.stato = stato;
    }
    public Ordine(String nomeCliente, String prodotto, int quantita, String stato) {
        this.nomeCliente = nomeCliente;
        this.prodotto = prodotto;
        this.quantita = quantita;
        this.stato = stato;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNomeCliente() {
        return nomeCliente;
    }
    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }
    public String getProdotto() {
        return prodotto;
    }
    public void setProdotto(String prodotto) {
        this.prodotto = prodotto;
    }
    public int getQuantita() {
        return quantita;
    }
    public void setQuantita(int quantita) {
        this.quantita = quantita;
    }
    public String getStato() {
        return stato;
    }
    public void setStato(String stato) {
        this.stato = stato;
    }

    //toString
    @Override
    public String toString() {
        return "Ordine: { id = " + id + " , nomeCliente = " + nomeCliente + " , prodotto = " + prodotto + " , quantita =" + quantita + 
                        " , stato = " + stato + " }";
    }
}