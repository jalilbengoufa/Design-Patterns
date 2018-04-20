package Example4;

abstract class Robot implements Cloneable{
    private String type;
    public Robot(String type) {
        super();
        this.type = type;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public String getType() {
        return type;
    }

}
