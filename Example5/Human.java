package Example5;

/**
 * Composite Pattern
 */
public interface Human {

    void add(Human human);
    Human getChild(int id);
    String getName();
    void ShowTree();

}
