package strategy.pattern;

public class FlyWithWings implements FlyBehaviour{
    @Override
    public void fly() {
        System.out.println("can fly with wings");
    }
}
