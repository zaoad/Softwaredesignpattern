package decorator.pattern.codiment;

import decorator.pattern.BasePizza;
import decorator.pattern.codimentTopping;

public class Cheese extends codimentTopping {

    double cost;
    String description;
    public Cheese(BasePizza basePizza)
    {
        super.basePizza=basePizza;
        this.cost=50.0;
        this.description=", cheese";
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
