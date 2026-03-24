public class Prodotto {
    //Attributi
    private String nome;
    private double prezzo;
    private int quantitaDisponibile;

    //Costruttore
    public Prodotto(String nome, double prezzo, int quantitaDisponibile) {
        this.nome = nome;
        this.prezzo = prezzo;
        this.quantitaDisponibile = quantitaDisponibile;
    }

    //Getter e setter
    public String getNome() {
        return nome;
    }
    public double getPrezzo() {
        return prezzo;
    }
    public int getQuantitaDisponibile() {
        return quantitaDisponibile;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setPrezzo(double prezzo) {
        this.prezzo = prezzo;
    }
    public void setQuantitaDisponibile(int quantitaDisponibile) {
        this.quantitaDisponibile = quantitaDisponibile;
    }

    //Stampa dati
    public void mostraDati() {
        System.out.println("Ecco i dati:\nNome prodotto: " + nome + "\nPrezzo: " + prezzo + 
        "\nQuantità disponibile: " + quantitaDisponibile);
    }
}