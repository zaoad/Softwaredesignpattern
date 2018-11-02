package decoratorPattern.Concrete_Class;

import decoratorPattern.BasePizza;

public class SicilianStyle extends BasePizza {
    public SicilianStyle() {
        cost = 400.0;
        description = "Sicilian Pizza";
    }

    @Override
    public double getCost() {
        return cost;
    }

    @Override
    public String getDescription() {
        return description;
    }
}
