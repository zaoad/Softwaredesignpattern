package adapter;

public class Roundhole {
    private  double radius;

    public Roundhole(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }
    public boolean fits(RoundPeg peg)
    {
        return this.radius>=peg.getRadius();
    }
}
