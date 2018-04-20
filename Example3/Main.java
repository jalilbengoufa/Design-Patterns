package Example3;

public class Main {
    public static void main (String[]args){

        GameSingleton gameSingleton = GameSingleton.getInstance(100);
        GameSingleton gameSingleton2 = GameSingleton.getInstance(999);

        //same number
        System.out.print(gameSingleton.getNumber()+ "\n");
        System.out.print(gameSingleton2.getNumber());

    }
}
