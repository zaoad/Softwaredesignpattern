package strategy.pattern;

public class FlyRocketPower implements FlyBehaviour {
    @Override
    public void fly() {
        System.out.println("can fly at a rocket speed");
    }
}
