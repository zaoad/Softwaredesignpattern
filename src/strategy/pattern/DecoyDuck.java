package strategy.pattern;

public class DecoyDuck extends Duck {
    @Override
    void display() {
        System.out.println("this is decoy duck");
    }
    public DecoyDuck()
    {
        setFlyBehaviour(new FlyNoWay());
        setQuackBehaviour(new MuteQuack());
    }
}
