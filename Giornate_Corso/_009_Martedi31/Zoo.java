import java.util.ArrayList;

public class Zoo {

    private ArrayList<Animale> listanimali;

    public Zoo() {
        this.listanimali = new ArrayList<>();
    }
    public ArrayList<Animale> getListanimali() {
        return listanimali;
    }
    public void setListanimali(ArrayList<Animale> listanimali) {
        this.listanimali = listanimali;
    }
    
    public void aggiungiAnimale(Animale a){
        listanimali.add(a);
    }
    
    public void stampaZoo(){
        for(Animale a : listanimali){
            System.out.print(a.toString() + " ");
            a.stampaVerso();
        }
    }

}
