package Example3;

/**
 * Singleton pattern
 */
public class GameSingleton {
    private static GameSingleton ourInstance ;
    private int number ;
    public static GameSingleton getInstance(int number) {
        if (ourInstance == null){
            ourInstance = new GameSingleton(number);
        }
        return ourInstance;
    }

    private GameSingleton(int number) {
        this.number=number;
    }

    public int getNumber() {
        return number;
    }
}
