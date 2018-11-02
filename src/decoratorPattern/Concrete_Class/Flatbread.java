package decoratorPattern.Concrete_Class;

import decoratorPattern.BasePizza;

public class Flatbread extends BasePizza {

    public Flatbread() {
        cost = 300.0;
        description = "Flatbread Pizza";
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
