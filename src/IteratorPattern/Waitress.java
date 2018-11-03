package IteratorPattern;

public class Waitress {

    BreakfastMenu breakfastMenu;
    DinnerMenu dinnerMenu;

    public Waitress(BreakfastMenu breakfastMenu , DinnerMenu dinnerMenu)
    {
       this.breakfastMenu=breakfastMenu;
       this.dinnerMenu = dinnerMenu;
    }
    public void printMenu()
    {
        DinnerMenuIterator dinnerMenuIterator = (DinnerMenuIterator)dinnerMenu.createIterator();
        BreakfastMenuIterator breakfastMenuIterator = (BreakfastMenuIterator)breakfastMenu.createIterator();
        System.out.println("Breakfast Menu items:");
        printMenu(breakfastMenuIterator);
        System.out.println("Dinner Menu items:");
        printMenu(dinnerMenuIterator);

        dinnerMenuIterator.remove(1);
        breakfastMenuIterator.remove(1);
        dinnerMenuIterator = (DinnerMenuIterator)dinnerMenu.createIterator();
        breakfastMenuIterator = (BreakfastMenuIterator)breakfastMenu.createIterator();
        System.out.println("After Modification:");
        System.out.println("Breakfast Menu items:");
        printMenu(breakfastMenuIterator);
        System.out.println("Dinner Menu items:");
        printMenu(dinnerMenuIterator);


    }
    private void printMenu( Iterator iterator)
    {
        while(iterator.hasNext())
        {
            MenuItem item = (MenuItem)iterator.next();
            System.out.println(item.getName()+": "+ item.getDescription()+" Price:"+item.getPrice());
        }
    }

}
