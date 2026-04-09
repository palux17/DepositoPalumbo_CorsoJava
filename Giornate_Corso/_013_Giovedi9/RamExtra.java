//Decorator concreto
public class RamExtra extends ComponenteExtra {
    public RamExtra(Computer computer) {
        super(computer);
    }
    public String getDescrizione() {
        return computer.getDescrizione() + ", RAM Extra";
    }
    public double getPrezzo() {
        return computer.getPrezzo() + 100;
    }
}