package decoratorPattern.codiment;

import decoratorPattern.BasePizza;
import decoratorPattern.codimentTopping;

public class Tomatoo extends codimentTopping {

    double cost;
    String description;
    public Tomatoo(BasePizza basePizza)
    {
        super.basePizza=basePizza;
        this.cost=20.0;
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
