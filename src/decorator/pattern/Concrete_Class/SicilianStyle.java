package decorator.pattern.Concrete_Class;

import decorator.pattern.BasePizza;

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
