package Example5;

public class Main {

    public static void main(String[] args) {

        Human human1 = new Child("Steve");
        Human human2 = new Child("James");

        Human batman = new Parent("Batman");
        Human superman = new Parent("superman");

        batman.add(human1);
        batman.add(human2);
        superman.add(batman);

        superman.ShowTree();


    }
}
