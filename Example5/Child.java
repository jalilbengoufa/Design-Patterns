package Example5;

public class Child implements Human{

    private String name;

    public Child(String name) {
        this.name = name;
    }

    @Override
    public void add(Human human) {

    }


    @Override
    public Human getChild(int id) {
        return null;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void ShowTree() {
        System.out.println("name :" + this.getName());
    }
}
