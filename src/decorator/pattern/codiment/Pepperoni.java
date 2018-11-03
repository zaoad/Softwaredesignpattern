package decorator.pattern.codiment;

import decorator.pattern.BasePizza;
import decorator.pattern.codimentTopping;

public class Pepperoni extends codimentTopping {

    double cost;
    String description;
    public Pepperoni(BasePizza basePizza)
    {
        super.basePizza=basePizza;
        this.cost=70.0;
        this.description=", pepperoni";
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
