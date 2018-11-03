package decorator.pattern.codiment;

import decorator.pattern.BasePizza;
import decorator.pattern.codimentTopping;

public class Salad extends codimentTopping {

    double cost;
    String description;
    public Salad(BasePizza basePizza)
    {
        super.basePizza=basePizza;
        this.cost=90.0;
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
