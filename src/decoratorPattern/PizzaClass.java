package decoratorPattern;

import decoratorPattern.Concrete_Class.Flatbread;
import decoratorPattern.Concrete_Class.NeapolitanCrust;
import decoratorPattern.Concrete_Class.SicilianStyle;
import decoratorPattern.Concrete_Class.ThinCrust;
import decoratorPattern.codiment.*;

public class PizzaClass {
    public static void main(String[] args) {
        BasePizza pizza=new Flatbread();
        System.out.println(pizza.getDescription());
        pizza=new Cheese(pizza);
        pizza=new Pepperoni(pizza);
        pizza=new Tomatoo(pizza);
        System.out.println(pizza.getDescription()+" cost: "+pizza.getCost());
        BasePizza pizza1=new NeapolitanCrust();
        pizza1=new Corn(pizza1);
        pizza1=new Onion(pizza1);
        pizza1=new Salad(pizza1);
        pizza1=new Sausage(pizza1);
        System.out.println(pizza1.getDescription()+" cost: "+pizza1.getCost());
        BasePizza pizza2=new ThinCrust();
        pizza2=new Bacon(pizza2);
        System.out.println(pizza2.getDescription()+" cost: "+pizza2.getCost());
        BasePizza pizza3=new SicilianStyle();
        pizza3=new Cheese(pizza3);
        System.out.println(pizza3.getDescription()+" cost: "+pizza3.getCost());




    }
}
