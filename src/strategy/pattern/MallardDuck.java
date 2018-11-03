package strategy.pattern;

public class MallardDuck extends Duck{
    public MallardDuck() {
        setFlyBehaviour(new FlyWithWings());
        setQuackBehaviour(new Quack());
    }

    @Override
    void display() {
        System.out.println("this is Mallard Duck");
    }
}
