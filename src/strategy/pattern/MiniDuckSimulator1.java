package strategy.pattern;

public class MiniDuckSimulator1 {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.performQuack();
        mallard.performFly();

        Duck model = new ModelDuck();
        model.performFly();
        model.setFlyBehaviour(new FlyRocketPower());
        model.performFly();
    }
}
