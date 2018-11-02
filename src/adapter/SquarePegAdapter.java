package adapter;

public class SquarePegAdapter extends RoundPeg{
    private SquarePeg peg;
    public SquarePegAdapter(SquarePeg peg) {
        super();
        this.peg = peg;
    }

    @Override
    public double getRadius() {
        double width=peg.getWidth();
        return Math.sqrt(2)*width/2;
    }
}
