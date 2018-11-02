package decoratorPattern.Concrete_Class;

import decoratorPattern.BasePizza;

public class NeapolitanCrust extends BasePizza {
    public NeapolitanCrust() {
        cost = 200.0;
        description = "Neapolitan Crust Pizza";
    }

    public double getCost() {
        return cost;
    }

    public String getDescription() {
        return description;
    }
}
