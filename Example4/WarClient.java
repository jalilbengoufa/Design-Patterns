package Example4;

/**
 * Prototype pattern
 */
public class WarClient {

    public static void main(String[] args) {

        BigRobot bigRobot = new BigRobot();
        SmallRobot smallRobot = new SmallRobot();

        try {

            Robot robot = (Robot) bigRobot.clone();
            System.out.print(robot.getType());
            Robot robot1 = (Robot) smallRobot.clone();
            System.out.print(robot1.getType());

        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

    }
}
