package strategy.pattern;

public class RubberDuck extends Duck{
    public RubberDuck() {
        setFlyBehaviour(new FlyNoWay());
        setQuackBehaviour(new Squack());
    }

    @Override
    void display() {
        System.out.println("this is rubber Duck");
    }
}
