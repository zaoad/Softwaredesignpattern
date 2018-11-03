package decorator.pattern.Concrete_Class;

import decorator.pattern.BasePizza;

public class ThinCrust extends BasePizza {


    public ThinCrust() {
        cost = 500.0;
        description = "Thin Pizza";
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
