package Example2;

public class Main {
    public static void main (String[]args){
        
        ConceteCreator conceteCreator = new ConceteCreator();

        Color color1 = conceteCreator.getColor(1);
        color1.getcolor();
        Color color2 = conceteCreator.getColor(99);
        color2.getcolor();

    }
}
