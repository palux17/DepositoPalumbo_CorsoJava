//Decorator astratto
public abstract class ComponenteExtra implements Computer {
    protected Computer computer;
    public ComponenteExtra(Computer computer) {
        this.computer = computer;
    }
}