package singleton.pattern;

public class ChocolateBoiler {
    private boolean empty;
    private boolean boiled;
    private static ChocolateBoiler chocolateBoiler;
    private ChocolateBoiler()
    {
        empty=true;
        boiled=false;
    }
    public static ChocolateBoiler getInstance()
    {
        if(chocolateBoiler==null)
        {
            synchronized (ChocolateBoiler.class)
            {
                if(chocolateBoiler==null)
                    chocolateBoiler=new ChocolateBoiler();
            }

        }
        return chocolateBoiler;
    }
    public void fill()
    {
        if(isEmpty())
        {
            empty=false;
            boiled=false;
        }
    }
    public void boil()
    {
        if(!isEmpty()&&!isBoiled())
        {
            boiled=true;
        }
    }
    public void drain()
    {
        if(!isEmpty()&&isBoiled())
        {
            empty=true;
            boiled=false;
        }
    }

    public boolean isEmpty() {
        return empty;
    }

    public boolean isBoiled() {
        return boiled;
    }
}
