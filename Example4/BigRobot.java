package Example4;

public class BigRobot extends Robot {

    public BigRobot() {
        super("big robot ");
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
