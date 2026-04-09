//Decorator concreto
public class SSDExtra extends ComponenteExtra {
    public SSDExtra(Computer computer) {
        super(computer);
    }
    public String getDescrizione() {
        return computer.getDescrizione() + ", SSD Extra";
    }
    public double getPrezzo() {
        return computer.getPrezzo() + 150;
    }
}