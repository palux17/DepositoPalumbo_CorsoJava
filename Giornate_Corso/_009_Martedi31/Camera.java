public class Camera {

    //Attributi + costruttori + getter setter
    private int numero;
    private float prezzo;
    public Camera(int numero, float prezzo) {
        this.numero = numero;
        this.prezzo = prezzo;
    }
    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }
    public float getPrezzo() {
        return prezzo;
    }
    public void setPrezzo(float prezzo) {
        this.prezzo = prezzo;
    }

    //Stampa dettagli
    public void dettagli() {
        System.out.println("Camera numero: " + numero + ", Prezzo: " + prezzo);
    }

    //Stampa dettagli con prezzo a scelta (overload)
    public void dettagli(boolean conPrezzo) {
        if (conPrezzo) {
            System.out.println("Camera numero: " + numero + ", Prezzo: " + prezzo);
        } else {
            System.out.println("Camera numero: " + numero);
        }
    }
}
