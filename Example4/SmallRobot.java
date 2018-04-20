package Example4;

public class SmallRobot extends Robot{

    public SmallRobot() {
        super("small robot");
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String getType() {
        return super.getType();
    }
}
