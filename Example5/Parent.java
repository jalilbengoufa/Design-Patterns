package Example5;

import java.util.ArrayList;
import java.util.Iterator;

public class Parent implements Human {

    private String name;
    ArrayList<Human> children = new ArrayList<Human>();

    public Parent(String name) {
        this.name = name;
    }


    @Override
    public void add(Human human) {
        children.add(human);
    }


    @Override
    public Human getChild(int id) {
        return children.get(id);
    }

    @Override
    public String getName() {
        return this.name;
    }

    public void ShowTree() {
        System.out.println("name :" + this.getName()+"\n");

        Iterator<Human> HumanIterator = children.iterator();
        while (HumanIterator.hasNext()) {
            Human human = HumanIterator.next();
            human.ShowTree();
        }
    }
}
