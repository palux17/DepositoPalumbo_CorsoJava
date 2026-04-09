//Decorator concreto
public class RaffreddamentoExtra extends ComponenteExtra {
    public RaffreddamentoExtra(Computer computer) {
        super(computer);
    }
    public String getDescrizione() {
        return computer.getDescrizione() + ", Raffreddamento";
    }
    public double getPrezzo() {
        return computer.getPrezzo() + 120;
    }
}