package strategy.pattern;

public class ModelDuck extends Duck {
    public ModelDuck() {
        setFlyBehaviour(new FlyRocketPower());
        setQuackBehaviour(new MuteQuack());
    }

    @Override
    void display() {
        System.out.println("this is model duck");
    }
}
