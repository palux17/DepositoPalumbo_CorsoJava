
public class GestioneLuciFacade {

    //Attributi nascosti
    private LuceCamera luceCamera;
    private LuceCucina luceCucina;

    //Costruttore
    public GestioneLuciFacade() {
        luceCamera = new LuceCamera();
        luceCucina = new LuceCucina();
    }

    //Richiama una volta i metodi
    public void accendiTutte() {
        luceCamera.accendi();
        luceCucina.accendi();
    }
}