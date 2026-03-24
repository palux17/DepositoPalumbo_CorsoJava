public class Negozio {

    //Attributi
    private String nomeNegozio;
    private Prodotto prodotto;

    //Costruttore
    public Negozio(String nomeNegozio) {
        this.nomeNegozio = nomeNegozio;
        this.prodotto = null;
    }
    
    //Getter e setter
    public String getNomeNegozio() {
        return nomeNegozio;
    }
    public Prodotto getProdotto() {
        return prodotto;
    }
    public void setProdotto(Prodotto prodotto) {
        this.prodotto = prodotto;
    }

    //Stampa dei prodotti del negozio se presenti
    public void mostraDatiNegozio() {
        System.out.println("Negozio: " + nomeNegozio);
        if (prodotto != null) {
            prodotto.mostraDati();
        } else {
            System.out.println("Nessun prodotto inserito.");
        }
    }

    //Modifica quantità di un prodotto
    public void modificaQuantita(int nuovaQuantita) {
        if (prodotto != null) {
            prodotto.setQuantitaDisponibile(nuovaQuantita);
            System.out.println("Quantità aggiornata");
        } else {
            System.out.println("Nessun prodotto presente.");
        }
    }

    //Vendita di prodotti se quantità positiva e se minore di quella presente
    public void vendiProdotto(int quantitaVenduta) {
        if (prodotto == null) {
            System.out.println("Nessun prodotto presente.");
            return;
        }
        if (quantitaVenduta <= 0) {
            System.out.println("La quantità deve essere positiva.");
            return;
        }
        if (quantitaVenduta > prodotto.getQuantitaDisponibile()) {
            System.out.println("Quantità troppo elevata.");
        } 
        else {
            int nuovaQuantita = prodotto.getQuantitaDisponibile() - quantitaVenduta;
            prodotto.setQuantitaDisponibile(nuovaQuantita);
            System.out.println("Venduto!");
        }
    }
}