package decorator.pattern.codiment;

import decorator.pattern.BasePizza;
import decorator.pattern.codimentTopping;

public class Sausage extends codimentTopping {

    double cost;
    String description;
    public Sausage(BasePizza basePizza)
    {
        super.basePizza=basePizza;
        this.cost=30.0;
        this.description=", Sausage";
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

