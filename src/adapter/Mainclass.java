package adapter;
import adapter.RoundPeg;
import adapter.Roundhole;
import adapter.SquarePeg;
import adapter.SquarePegAdapter;

import javax.swing.*;

public class Mainclass {
    public static void main(String[] args) {
        Roundhole roundhole=new Roundhole(5);
        RoundPeg smallroundPeg=new RoundPeg(4);
        RoundPeg bigroundPeg=new RoundPeg(10);
        SquarePeg smallsquarepeg=new SquarePeg(6);
        SquarePeg bigsquarepeg=new SquarePeg(20);
        if(roundhole.fits(smallroundPeg))
            System.out.println("roundpeg fits in roundhole");
        else
            System.out.println("roundpeg not fits in roundhole");
        if(roundhole.fits(bigroundPeg))
            System.out.println("roundpeg fits in roundhole");
        else
            System.out.println("roundpeg not fits in roundhole");
        if(roundhole.fits(new SquarePegAdapter(smallsquarepeg)))
        {
            System.out.println("squarepeg fits in roundhole");
        }
        else
            System.out.println("squarepeg not fits in roundpeg");
        if(roundhole.fits(new SquarePegAdapter(bigsquarepeg)))
        {
            System.out.println("squarepeg fits in roundhole");
        }
        else
            System.out.println("squarepeg not fits in roundpeg");


    }
}
