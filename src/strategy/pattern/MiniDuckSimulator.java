package strategy.pattern;

public class MiniDuckSimulator {
    public static void main(String[] args) {
        MallardDuck	mallard = new MallardDuck();
        RubberDuck	rubberDuckie = new RubberDuck();
        DecoyDuck	decoy = new DecoyDuck();

        Duck	 model = new ModelDuck();

        mallard.performQuack();
        rubberDuckie.performQuack();
        decoy.performQuack();

        model.performFly();
        model.setFlyBehaviour(new FlyRocketPower());
        model.performFly();
    }
}
