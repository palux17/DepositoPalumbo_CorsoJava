import java.util.ArrayList;

public class Hotel {

    //Attributi + Costruttore + Getter e Setter
    private String nome;
    private ArrayList<Camera> listaCamere;
    public Hotel(String nome) {
        this.nome = nome;
        this.listaCamere = new ArrayList<>();
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public ArrayList<Camera> getListaCamere() {
        return listaCamere;
    }
    public void setListaCamere(ArrayList<Camera> listaCamere) {
        this.listaCamere = listaCamere;
    }


    //Aggiunge camera
    public void aggiungiCamera(Camera camera) {
        listaCamere.add(camera);
    }

    //Conta suite (statico)
    public static int contaSuite(ArrayList<Camera> lista) {
        int contatore = 0;
        for (Camera camera : lista) {
            if (camera instanceof Suite) {
                contatore++;
            }
        }
        return contatore;
    }
}