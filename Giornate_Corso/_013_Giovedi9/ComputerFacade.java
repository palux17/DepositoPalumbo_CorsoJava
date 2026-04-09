public class ComputerFacade {

    //Attributi private
    private Bios bios;
    private HardDisk hardDisk;
    private SistemaOperativo sistemaOperativo;

    //Costruttore
    public ComputerFacade() {
        bios = new Bios();
        hardDisk = new HardDisk();
        sistemaOperativo = new SistemaOperativo();
    }

    //Metodo che richiama altri metodi 
    public void accendiComputer() {
        bios.inizializza();
        hardDisk.carica();
        sistemaOperativo.avvia();
    }
}