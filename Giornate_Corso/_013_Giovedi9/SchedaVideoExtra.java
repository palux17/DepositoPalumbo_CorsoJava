//Decorator concreto
public class SchedaVideoExtra extends ComponenteExtra {
    public SchedaVideoExtra(Computer computer) {
        super(computer);
    }
    public String getDescrizione() {
        return computer.getDescrizione() + ", GPU Extra";
    }
    public double getPrezzo() {
        return computer.getPrezzo() + 300;
    }
}