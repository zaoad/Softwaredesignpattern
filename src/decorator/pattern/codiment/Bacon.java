package decorator.pattern.codiment;

import decorator.pattern.BasePizza;
import decorator.pattern.codimentTopping;

public class Bacon extends codimentTopping {

    double cost;
    String description;
    public Bacon(BasePizza basePizza)
    {
        super.basePizza=basePizza;
        this.cost=75.0;
        this.description=", Bacon";
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
