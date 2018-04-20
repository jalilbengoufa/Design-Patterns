package Example2;

public class ConceteCreator {
    /**
     * Factorymethode()
     * @param number integer
     * @return a color
     */
    public Color getColor(int number){
        if (number == 0){
            return null;
        }
        if (number == 1 ) {

            return new Red();
        }else{

            return new Blue();
        }
    }
}
