package decorator.pattern.codiment;

import decorator.pattern.BasePizza;
import decorator.pattern.codimentTopping;

public class Onion extends codimentTopping {

    double cost;
    String description;
    public Onion(BasePizza basePizza)
    {
        super.basePizza=basePizza;
        this.cost=20.0;
        this.description=", Onion";
    }
    @Override
    public double getCost() {
        return basePizza.getCost()+this.cost;
    }

    @Override
    public String getDescription() {
        return basePizza.getDescription()+this.description;
    }
}
