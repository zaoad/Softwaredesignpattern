package strategy.pattern;

public class RedHeadDuck extends Duck{
    public RedHeadDuck() {
        setFlyBehaviour(new FlyWithWings());
        setQuackBehaviour(new Quack());
    }

    @Override
    void display() {
        System.out.println("this is Read head Duck");
    }
}
