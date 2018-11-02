package decoratorPattern.codiment;

import decoratorPattern.BasePizza;
import decoratorPattern.codimentTopping;

public class Corn extends codimentTopping {

    double cost;
    String description;
    public Corn(BasePizza basePizza)
    {
        super.basePizza=basePizza;
        this.cost=110.0;
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
