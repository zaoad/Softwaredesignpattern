package singleton.pattern;

public class ChocolateFactory {
    public static void main(String[] args) {
        ChocolateBoiler chocolateBoiler;
        chocolateBoiler=ChocolateBoiler.getInstance();
        System.out.println("Is empty: "+chocolateBoiler.isEmpty());
        System.out.println("Is Boiled: "+chocolateBoiler.isBoiled());
        ChocolateBoiler chocolateBoiler1;
        chocolateBoiler1=ChocolateBoiler.getInstance();
        System.out.println("Is empty: "+chocolateBoiler1.isEmpty());
        System.out.println("Is Boiled: "+chocolateBoiler1.isBoiled());
        chocolateBoiler.fill();
        ChocolateBoiler chocolateBoiler2;
        chocolateBoiler2=ChocolateBoiler.getInstance();
        System.out.println("Is empty: "+chocolateBoiler2.isEmpty());
        System.out.println("Is Boiled: "+chocolateBoiler2.isBoiled());



    }
}
