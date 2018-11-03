package decorator.pattern;

public abstract class BasePizza {
    public double cost;
    public String description;

    public abstract double getCost();

    public abstract String getDescription();
}
